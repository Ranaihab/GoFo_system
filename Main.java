
import GoFo_System.GoFo;
import GoFo_System.User;
import java.util.Scanner;
import java.util.*;

import GoFo_System.Adminstrator;
import GoFo_System.Date;
import Player_Content.Player;
import Player_Content.FavouriteTeam;
import PlaygroundOwnerContent.Location;
import PlaygroundOwnerContent.Playground;
import PlaygroundOwnerContent.PlaygroundOwner;
import PlaygroundOwnerContent.Book;

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

 

public class Main {

	

	public static void mainMenu()
	{
		Scanner scanner = new Scanner(System.in);
		GoFo gofo = new GoFo();
		String option =" ";
		while (true)
		{
			System.out.println("\n1- Register" +
                    "\n2- Exit");	
			option = scanner.nextLine();
			if (option.equalsIgnoreCase("1"))
			{
				gofo.register();
				playerMenu();
			}
			
			else if (option.equalsIgnoreCase("2"))
			{
				break;
			}
			
			else 
			{
				System.out.println("Enter valid option");
			}
		}
		
	}
	
	public static void playerMenu()
	{
		Scanner scanner = new Scanner(System.in);
		GoFo gofo = new GoFo();
		String option =" ";
		while (true) {
			System.out.println(
	                "\n1- View Books"+
					"\n2- Create Favourite Team"+
	                "\n3- Book Playground"+
					"\n4- Display Playgrounds"+
	                "\n5- Exit"
					);
			System.out.println("Enter your choice: ");
			option = scanner.nextLine();
			if (option.equalsIgnoreCase("1"))
			{
				gofo.viewBooks();
			}
			
			else if (option.equalsIgnoreCase("2"))
			{
				String name;
				String email;
				String choice;
				FavouriteTeam favTeam = new FavouriteTeam();
				while (true)
				{
					
					System.out.println("Enter the name: ");
					name = scanner.nextLine();
					favTeam.addNames(name);	
					System.out.println("Enter the email: ");
					email = scanner.nextLine();
					favTeam.addEmails(email);
					System.out.println("Do you want to add more players? (y/n)");
					choice = scanner.nextLine();
					if (choice.equalsIgnoreCase("y")) continue;
					else break;
					
				}
			}
			
			else if (option.equalsIgnoreCase("3"))	//TODO///////////////////////////////////////////////
			{
				int pgID;
			
				gofo.viewPlaygrounds();
				Playground pg = new Playground();
				System.out.println("Enter the id of playground you want to book : ");
				pgID = scanner.nextInt();
				System.out.println("Enter the slot you wanna book : ");
		
				for (int i=0;i<pg.getCount();i++)
				{
					int id = gofo.getPlaygrounds().get(i).getID();
					
					if (id == pgID)
					{
						
					}
				}
				
				
			}
			
			else if (option.equalsIgnoreCase("4"))
			{
				gofo.viewPlaygrounds();
			}
			
			else if (option.equalsIgnoreCase("5"))
			{
				break;
			}
			
			
		}
	}

	public static void main(String[] args) {

		mainMenu();
	}

}
