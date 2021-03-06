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
import java.util.ArrayList;

/**
 * The Class is an abstract for generalizations with other classes.
 */
public class FavouriteTeam {
	protected ArrayList<String>names;
	protected ArrayList<String>emails;
	
	/**
	 * Constructor for initializing arrays of names and email's for teams.
	 */
	public FavouriteTeam()
	{
		names = new ArrayList<>(0);
		emails = new ArrayList<>(0);
	}
	
	/**
	 * add names of team to arrayList.
	 * @param name of member of favorite team to be added.
	 */
	public void addNames(String name)
	{
		names.add(name);
	}
	
	/**
	 * add mails of team to arraylist.
	 * @param email of member of favorite team to be added.
	 */
	public void addEmails(String email)
	{
		emails.add(email);
	}
	
	/**
	 * Gets the names of teams from the array list.
	 * @return all names of members in team.
	 */
	public ArrayList<String> getNames()
	{
		return names;
	}
	
	/**
	 * Gets mails of teams from the array list.
	 * @return all emails of members in team.
	 */
	public ArrayList<String> getEmails()
	{
		return emails;
	}

}
