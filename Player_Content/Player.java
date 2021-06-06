package Player_Content;

import PlaygroundOwnerContent.Book;
import PlaygroundOwnerContent.Book.BookStatus;
import PlaygroundOwnerContent.Playground;
import PlaygroundOwnerContent.Playground.PlaygroundStatus;

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

/**
 * The Class is an abstract for generalizations with other classes
 */
public abstract class Player {
	protected int noBooks;
	
	/**
	 * Constructor for initializing number of books 
	 * @param noBooks
	 */
	public Player(int numB)
	{
		noBooks = numB;
	}
	
	/**
	 * Gets the number of books for player
	 * @return noBooks
	 */
	public int getNoBooks()
	{
		return noBooks;
	}
	
	/**
	 * Sets the number of books for player
	 * @param noBooks
	 */
	public void setNoBooks(int noBooks)
	{
		this.noBooks = noBooks;
	}
	
	/**
	 * void function to book playgrounds 
	 * @param playground
	 */
	public void book(Playground playground)
	{
		playground.setStatus(PlaygroundStatus.activate);
	}
	
	/**
	 * boolean function to cancel book 
	 * @param book
	 * @return true if it's cancelled and false if it's not
	 */
	public boolean cancelBook(Book book)
	{
		if (book.getStatus().equals("pending"))
		{
			book.setStatus(BookStatus.refused);
			return true;
		}
		
		else return false;		
	}
	
	/**
	 * void functions to remove pending requests 
	 * @param book
	 */
	public void removeRequests(Book book)
	{
		if (book.getStatus().equals("pending"))
		{
			book.setStatus(BookStatus.refused);
		}
	}
	
	/**
	 * check if there's book or not 
	 * @param book
	 * @return true if booked and false if it's not booked 
	 */
	public boolean book(Book book)
	{
		if (book.getStatus().equals("accepted"))
		{
			return true;
		}
		else return false;
	}

}