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

import java.util.Scanner;
import java.util.*;
import GoFoSystem.*;
import PlayerContent.*;
import PlaygroundOwnerContent.*;

/**
 * Class gives a list of choice to the user to perform in the system.
 */
public class Main {

	

	public static void main(String[] args) {
		GoFo gofo = new GoFo();
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.print("Do you want to register or exit? ");
			String option = in.nextLine();
			if(option.equalsIgnoreCase("exit"))
				break;
			if(!option.equalsIgnoreCase("register"))
				continue;

			System.out.print("Do you want to register as a player or playground owner: ");
			String op = in.nextLine();

			if(op.equalsIgnoreCase("playground owner")){
				PlaygroundOwner owner = gofo.ownerRegister();
				while(true) {
					System.out.println("Choices: \n1- View playgrounds \n2- Add playground \n3- view requests \n4- exit");
					System.out.print("your choice: ");
					op = in.nextLine();
					if(op.equals("1")){
						owner.viewPlaygrounds();
					}
					else if(op.equals("2")){
						owner.addPlayground();
						Playground playground = owner.getPlaygrounds().get(owner.getPlaygrounds().size() - 1);
						gofo.getAdmin().addPlayground(playground);
						System.out.print("As an administrator, ");
						gofo.getAdmin().acceptPlayground(owner.getPlaygrounds().get(owner.getPlaygrounds().size() - 1));
					}
					else if(op.equals("3")){
						owner.viewBooks();
					}
					else if(op.equals("4")) {
						break;
					}
				}
			}

			else if(op.equalsIgnoreCase("player")){
				Player player = gofo.playerRegister();
				while(true) {
					System.out.println("Choices: \n1- View playgrounds \n2- view Books \n3- exit");
					System.out.print("your choice: ");
					op = in.nextLine();
					if(op.equals("1")) {
						System.out.print("Enter city name to view playgrounds in this city or enter all to view all playgrounds: ");
						op = in.nextLine();
						if (op.equalsIgnoreCase("all")) {
							gofo.viewActivatedPlaygrounds();
						} else {
							gofo.filterByLocation(op);
						}

						System.out.print("Do you want to book (yes/no): ");
						op = in.nextLine();
						if (op.equalsIgnoreCase("yes")) {
							System.out.print("Enter playground id: ");
							int id = in.nextInt();
							in.nextLine();
							for (int i = 0; i < gofo.getPlaygrounds().size(); i++) {
								if (gofo.getPlaygrounds().get(i).getID() == id) {
									player.book(gofo.getPlaygrounds().get(i));
									break;
								}
							}
							System.out.print("As the playground's owner, ");
							Book book = player.getBooks().get(player.getBooks().size() - 1);
							if(book.getPlayground().getPlaygroundOwner().accept_refuseBooks(book)){
								gofo.addBook(book);
							}

						}
					}

					else if(op.equals("2")){
						player.viewBooks();
					}
					else if(op.equals("3")){
						break;
					}
				}
			}
		}
	}

}
