/**
 * 
 */
package edu.albany.FinalProject;

/**
 * Owner --creates owner (employee of nfl)
 * @author Kyle Jeffreys
 *
 */
public class Owner extends Employee{

	/**
	 * Owner of a franchise
	 * @param f -first name
	 * @param l	-last
	 * @param s -salary
	 * @param fran -team/franchise
	 * @param title - job title
	 */
	public Owner(String f, String l, double s, String fran, String title) {
		super(f, l, s, fran, title);
	}
	
	public String getOwner()
	{
		return this.getfName() + this.getlName();
	}
	
	public String toString()
	{
		return super.toString();
	}
		

}
