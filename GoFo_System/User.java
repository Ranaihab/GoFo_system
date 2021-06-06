package GoFo_System;

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
 * /

/**
 * The Class is an abstract for generalizations with other classes
 */
public abstract class User {

	protected String name;	
	protected int ID;
	protected String email;
	protected String password;
	protected String phone;
	protected String location;
	protected double eWallet;
	
	/**
	 * Constructor for initializing objects
	 * @param n is name of user
	 * @param id is ID of user
	 * @param mail id email of user
	 * @param ph is phone of user
	 * @param pass is password of user 
	 * @param loc is location of user
	 * @param eW is eWallet of user  
	 */
	public User(String n, int id, String mail, String pass, String ph, String loc, double eW )
	{
		name = n;
		id = ID;
		mail = email;
		ph = phone;
		pass = password;
		loc = location;
		eW = eWallet;
	}
	
	/**
	 * Gets the name of the user
	 * @return name
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Sets the name of the user
	 * @param name
	 */
	public void setName (String name)
	{
		this.name = name;
	}
	
	/**
	 * Gets the id of the user 
	 * @return ID
	 */
	public int getID()
	{
		return ID;
	}
	
	/**
	 * Sets the id of the user
	 * @param ID
	 */
	public void setID(int ID)
	{
		this.ID = ID;
	}
	
	/**
	 * Gets the email of the user
	 * @return email
	 */
	public String getMail()
	{
		return email;
	}
	
	/**
	 * Sets the email of the user
	 * @param email
	 */
	public void setMail(String email)
	{
		this.email = email;
	}
	
	/**
	 * Gets the password of the user
	 * @return password
	 */
	public String getPassword()
	{
		return password;
	}
	
	/**
	 * Sets the password of the user
	 * @param password
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	/**
	 * Gets the phone of the user
	 * @return phone
	 */
	public String getPhone()
	{
		return phone;
	}
	
	/**
	 * Sets the phone of the user
	 * @param phone
	 */
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	
	/**
	 * Gets the location of the user
	 * @return location
	 */
	public String getLocation()
	{
		return location;
	}
	
	/**
	 * Sets the location of the user
	 * @param location
	 */
	public void setLocation(String location)
	{
		this.location = location;
	}
	
	/**
	 * Gets the amount of money in eWallet of the user
	 * @return eWallet
	 */
	public double geteWallet()
	{
		return eWallet;
	}
	
	/**
	 * Sets the amount of money in eWallet of the user
	 * @param eWallet
	 */
	public void seteWallet(int eWallet)
	{
		this.eWallet = eWallet;
	}
	
	/**
	 * Prints the current money in the user's eWallet
	 */
	public void checkMoney()
	{
		System.out.println("Your money is: "+ eWallet);
	}
	
	/**
	 * Transfer amount of money from the eWallet of the user to another user's eWallet
	 * @param amount of money that will be transferred
	 * @param user the user to transfer money to
	 */
	void transferMoney(double amount, User user)
	{
		if (amount > eWallet || amount <=0)
		{
			System.out.println("Error...!!");
		}
		
		else {
			eWallet -=amount;
			System.out.println("The money was successfully transfered..");
		}
	}

}