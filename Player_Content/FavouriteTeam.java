package Player_Content;

import java.util.ArrayList;

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
public class FavouriteTeam {
	protected ArrayList<String>names;
	protected ArrayList<String>emails;
	
	/**
	 * Constructor for initializing arrays of names and email's for teams
	 */
	public FavouriteTeam()
	{
		names = new ArrayList<>();
		emails = new ArrayList<>();	
	}
	
	/**
	 * add names of team to arrayList
	 * @param name
	 */
	public void addNames(String name)
	{
		names.add(name);
	}
	
	/**
	 * add mails of team to arraylist
	 * @param email
	 */
	public void addEmails(String email)
	{
		emails.add(email);
	}
	
	/**
	 * Gets the names of teams from the array list
	 * @return
	 */
	public ArrayList<String> getNames()
	{
		return names;
	}
	
	/**
	 * Gets mails of teams from the array list
	 * @return
	 */
	public ArrayList<String> getEmails()
	{
		return emails;
	}

}
