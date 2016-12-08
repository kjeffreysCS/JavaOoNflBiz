/**
 * 
 */
package edu.albany.FinalProject;

import java.util.ArrayList;

/**
 * NflFranchise - an nfl organization
 * @author Kyle Jeffreys
 *
 */
public class NflFranchise extends Franchise{
	private Owner franchiseOwner;
	private String stadium;
	private Roster<Player> franchiseRoster;
	private ArrayList<Games> schedule = new ArrayList();

	
	public NflFranchise()
	{
	}
	
	public void getRoster()
	{
		for(int i = 0;i<franchiseRoster.size();++i)
		{
			System.out.println("Player " + (i+1) + ": ");
			System.out.println(franchiseRoster.getAtIndex(i));
		}
	}
	
	public void addRoster(Roster<Player> roster)
	{
		this.franchiseRoster = roster;
	}
	
	
	
	public String getStadium() {
		return stadium;
	}
	
	public void setStadium(String stadium)
	{
		this.stadium = stadium;
	}
	
	public String getStadiumLocation() {
		return super.getLocation();
	}

	@Override
	public String getOwner() {
		return super.getOwner();
	}

	public void printSchedule() 
	{
		for(int i = 0; i<schedule.size();++i)
		{
			System.out.println("Game " + (i+1) + " is against the " + schedule.get(i).opponentByWeek(i+1));
		}
		
	}
	
	public void setSchedule(Games next) 
	{		
		schedule.add(next);
	}
	
	public String toString()
	{
		return super.toString();
	}

}
