package Player_Content;

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
	
	public void book(Playgroung playground)
	{
		
	}
	
	public boolean cancelBook(Book book)
	{
		
	}
	
	public void removeRequests(Book book)
	{
		
	}
	
	public boolean book(Book book)
	{
		
	}

}
