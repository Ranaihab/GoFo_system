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

import PlaygroundOwnerContent.*;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class contains all the functions that the administrator of the system is responsible for.
 */
public class Adminstrator {
	private GoFo gofo;
	private ArrayList<Playground> playgrounds;

	public Adminstrator(GoFo g){
		gofo = g;
		playgrounds = new ArrayList<>(0);
	}

	/**
	 * void function to suspend the playground.
	 * @param playground that the administrator will suspend.
	 */
	public void suspendPlayground(Playground playground)
	{
		if(playground.getStatus() != Playground.PlaygroundStatus.deleted)
			playground.setStatus(Playground.PlaygroundStatus.suspended);
	}
	
	/**
	 * void function to activate the playground.
	 * @param playground to be activated.
	 */
	public void activatePlayground(Playground playground)
	{
		if(playground.getStatus() != Playground.PlaygroundStatus.deleted)
			playground.setStatus(Playground.PlaygroundStatus.activate);
	}

	/**
	 * Function to delete playgrounds from the system
	 * @param playground to be deleted.
	 */
	public void deletePlayground(Playground playground)
	{
		playground.setStatus(Playground.PlaygroundStatus.deleted);
		gofo.removePlayground(playground);
	}
	
	/**
	 * function to accept or refuse registering a playground to the system.
	 * @param playground that will be either accepted or refused.
	 * @return true if playground accepted or false otherwise.
	 */
	public boolean acceptPlayground(Playground playground)
	{
		System.out.print("Accept or Refuse playground: ");
		Scanner input = new Scanner(System.in);
		String st = input.nextLine();
		if (st.equalsIgnoreCase("accept"))
		{
			gofo.addPlayground(playground);
			playground.setStatus(Playground.PlaygroundStatus.activate);
			removePlayground(playground);
			return true;
		}
		else{
			playground.setStatus(Playground.PlaygroundStatus.refused);
			removePlayground(playground);
			return false;
		}
	}

	/**
	 * void function adds playgrounds to the arraylist of the administrator
	 * @param playground to be added
	 */
	public void addPlayground(Playground playground)
	{
		playgrounds.add(playground);

	}

	/**
	 * Function to remove playground from the arraylist of the administrator so that only requests that are not seen are in the array.
	 * @param playground to be removed.
	 */
	public void removePlayground(Playground playground){
		for (int i = 0; i < playgrounds.size(); i++) {
			if (playgrounds.get(i).getID() == playground.getID()) {
				playgrounds.remove(i);
				break;
			}
		}
	}

}