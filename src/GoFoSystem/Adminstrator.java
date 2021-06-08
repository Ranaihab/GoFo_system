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

import java.util.Scanner;


public class Adminstrator {
	GoFo gofo;

	public Adminstrator(GoFo g){
		gofo = g;
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
	 * void function to activate the playground
	 * @param playground
	 */
	public void activatePlayground(Playground playground)
	{
		if(playground.getStatus() != Playground.PlaygroundStatus.deleted)
			playground.setStatus(Playground.PlaygroundStatus.activate);
	}

	public void deletePlayground(Playground playground)
	{
		playground.setStatus(Playground.PlaygroundStatus.deleted);
	}
	
	/**
	 * boolean function to return true if the playground is accepted or return false if it's not
	 * @param playground
	 * @return true or false
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
			return true;
		}
		else{
			playground.setStatus(Playground.PlaygroundStatus.refused);
			return false;
		}
	}
	
	/**
	 * void function adds playgrounds and activate their state
	 * @param playground
	 */
	public void addPlayground(Playground playground)
	{
		playground.setStatus(Playground.PlaygroundStatus.activate);
		GoFo p = null;
		p.addPlayground(playground);
		
	}
	
	/**
	 * void function to delete playgrounds 
	 * @param playground
	 */
	public void removePlayground(Playground playground)
	{
		playground.setStatus(Playground.PlaygroundStatus.deleted);
		gofo.removePlayground(playground);
	}
}