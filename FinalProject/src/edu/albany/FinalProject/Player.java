/**
 * 
 */
package edu.albany.FinalProject;

/**
 * NflPlayer - football players for nfl rosters.
 * @author Kyle
 *
 */
public class Player extends Employee{

	private String position;
	
	public Player(String f, String l, double s, String fran, String title, String position) {
		super(f,l,s,fran,title);
		this.position = position;		
	}
	
	public String getPosition()
	{
		return position;
	}
	
	public void setPosition(String newPosition)
	{
		this.position = newPosition;
	}

	

}
