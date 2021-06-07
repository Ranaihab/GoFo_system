package GoFo_System;

import PlaygroundOwnerContent.Book;
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

public abstract class Adminstrator {
	
	/**
	 * void function to suspend the playground
	 * @param playground
	 */
	public void suspendPlayround(Playground playground)
	{
		playground.setStatus(PlaygroundStatus.suspended);
	}
	
	/**
	 * void function to activate the playground
	 * @param playground
	 */
	public void activatePlayround(Playground playground)
	{
		playground.setStatus(PlaygroundStatus.activate);
	}
	
	/**public Playground deletePlayground(Playground playground)		//TODO
	{
		GoFo gofo = null;
		gofo.removePlayground(playground);
		playground.setStatus(PlaygroundStatus.deleted);
		return 
	}**/
	
	/**
	 * boolean function to return true if the playground is accepted or return false if it's not
	 * @param playground
	 * @return true or false
	 */
	public boolean acceptPlayground(Playground playground)
	{
		if (playground.getStatus().equals("activate"))
		{
			return true;
		}
		else return false;
	}
	
	/**
	 * void function adds playgrounds and activate their state
	 * @param playground
	 */
	public void addPlayground(Playground playground)
	{
		playground.setStatus(PlaygroundStatus.activate);
		GoFo p = null;
		p.addPlayground(playground);
		
	}
	
	/**
	 * void function to delete playgrounds 
	 * @param playground
	 */
	public void removePlayground(Playground playground)
	{
		playground.setStatus(PlaygroundStatus.deleted);
		GoFo p = null;
		p.removePlayground(playground);
	}
	

}