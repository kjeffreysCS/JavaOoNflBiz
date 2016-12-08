/**
 * 
 */
package edu.albany.FinalProject;
import java.util.ArrayList;
/**
 * @author Kyle Jeffreys
 *
 */
public class Roster <T>{
	private ArrayList<Player> roster;
	private int size;
	
	public Roster()
	{
		roster = new ArrayList<Player>();
	}
	
	//drafts a player for the team
	public void draft(Player p)
	{
		roster.add(p);
		++size;
	}
	
	//trades away first argument for and trades for the second argument
	public void trade(Player p, Player newPlayer)
	{
		roster.remove(p);
		roster.add(newPlayer);
	}

	public Player getAtIndex(int id){
		return roster.get(id);
	}
	
	public void removeAt(int id){
		roster.remove(id);
	}
	
	public int size()
	{
		return size;
	}

}
       