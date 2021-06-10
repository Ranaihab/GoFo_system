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

package GoFoSystem;
import PlaygroundOwnerContent.Location;

/**
 * The Class is an abstract for generalizations with other classes.
 */
public abstract class User {

	protected String name;	
	protected int ID;
	protected String email;
	protected String password;
	protected String phone;
	protected Location location;
	protected double eWallet;
	
	/**
	 * Constructor for initializing objects.
	 * @param n is name of user.
	 * @param id is ID of user.
	 * @param mail id email of user.
	 * @param ph is phone of user.
	 * @param pass is password of user.
	 * @param loc is location of user.
	 * @param money is amount of money in the user's ewallet.
	 */
	public User(String n, int id, String mail, String pass, String ph, Location loc, Double money)
	{
		name = n;
		ID = id;
		email = mail;
		phone = ph;
		password = pass;
		location = loc;
		eWallet = money;
	}
	
	/**
	 * Gets the name of the user.
	 * @return name name of user.
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Sets the name of the user.
	 * @param name the new name.
	 */
	public void setName (String name)
	{
		this.name = name;
	}
	
	/**
	 * Gets the id of the user.
	 * @return ID of user.
	 */
	public int getID()
	{
		return ID;
	}
	
	/**
	 * Sets the id of the user.
	 * @param ID the new id.
	 */
	public void setID(int ID)
	{
		this.ID = ID;
	}
	
	/**
	 * Gets the email of the user.
	 * @return email of user.
	 */
	public String getMail()
	{
		return email;
	}
	
	/**
	 * Sets the email of the user.
	 * @param email the new email of user.
	 */
	public void setMail(String email)
	{
		this.email = email;
	}
	
	/**
	 * Gets the password of the user.
	 * @return password of user.
	 */
	public String getPassword()
	{
		return password;
	}
	
	/**
	 * Sets the password of the user.
	 * @param password the new password.
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	/**
	 * Gets the phone of the user.
	 * @return phone of user.
	 */
	public String getPhone()
	{
		return phone;
	}
	
	/**
	 * Sets the phone of the user.
	 * @param phone the new phone.
	 */
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	
	/**
	 * Gets the location of the user.
	 * @return location of user.
	 */
	public Location getLocation()
	{
		return location;
	}
	
	/**
	 * Sets the location of the user.
	 * @param location new location.
	 */
	public void setLocation(Location location)
	{
		this.location = location;
	}
	
	/**
	 * Gets the amount of money in eWallet of the user.
	 * @return eWallet gets money in the ewallet.
	 */
	public double geteWallet()
	{
		return eWallet;
	}
	
	/**
	 * Sets the amount of money in eWallet of the user.
	 * @param eWallet the new money in ewallet.
	 */
	public void seteWallet(Double eWallet)
	{
		this.eWallet = eWallet;
	}
	
	/**
	 * Prints the current money in the user's eWallet.
	 */
	public void checkMoney()
	{
		System.out.println("Your money is: "+ eWallet);
	}
	
	/**
	 * Transfer amount of money from the eWallet of the user to another user's eWallet.
	 * @param amount of money that will be transferred.
	 * @param user the user to transfer money to.
	 */
	public void transferMoney(double amount, User user)
	{
		if (amount > eWallet || amount <=0)
		{
			System.out.println("Error...!!");
		}
		
		else {
			eWallet -=amount;
			double mon = user.geteWallet() + amount;
			user.seteWallet(mon);
			System.out.println("The money was successfully transfered..");
		}
	}

}
