/**
 * @author Alaa Mahmoud Ebrahim
 * ID: 20190105
 * Group: 12
 * @author Rana Ihab Ahmed Fahmy
 * ID: 20190207
 * Group: 12
 * @author Habeba Rabie Hassan
 * ID: 20190167
 * Group: 11
 */

package PlayerContent;

import PlaygroundOwnerContent.*;
import GoFoSystem.*;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * The Class is an abstract for generalizations with other classes.
 */
public class Player extends User {
	private ArrayList<Book> books;

	/**
	 * Constructor for player
	 * @param n
	 * @param id
	 * @param mail
	 * @param pass
	 * @param ph
	 * @param loc
	 */
	public Player(String n, int id, String mail, String pass, String ph, Location loc, Double money)
	{
		super(n,id,mail,pass,ph,loc, money);
		books = new ArrayList<Book>(0);
	}

	/**
	 * @return all books that the player booked
	 */
	public ArrayList<Book> getBooks(){
		return books;
	}
	/**
	 * void function to book playgrounds 
	 * @param playground that player will book
	 */
	public void book(Playground playground)
	{
		playground.viewAvailableHours();
		Scanner input = new Scanner(System.in);
		ArrayList<Date> slots = new ArrayList<Date>(0);
		while(true) {
			System.out.println("Enter numbers of slot or '0' to exit");
			int x = input.nextInt();
			input.nextLine();
			if (x == 0)
				break;
			slots.add(playground.getAvailableHours().get(x - 1));
		}
		System.out.print("Number of players: ");
		int noplayer = input.nextInt();
		input.nextLine();
		Book book = new Book(slots, this, playground, noplayer);
		books.add(book);
		playground.getPlaygroundOwner().addBook(book);

	}

	/**
	 * check if there's book or not 
	 * @param book
	 * @return true if booked and false if it's not booked 
	 */
	public boolean book(Book book)
	{
		return (book.addPlayer(this));
	}

	/**
	 * View books of the player
	 */
	public void viewBooks(){
		for(int i = 0; i<books.size(); i++){
			books.get(i).print();
			System.out.println();
		}
	}
}