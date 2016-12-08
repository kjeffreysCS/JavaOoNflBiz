/**
 * 
 */
package edu.albany.FinalProject;
import java.util.HashMap;
/**
 * @author Kyle
 *
 */
public class Games <T> {
	private int ticketPrice = 25;
	private int stadiumSeats = 60000;
	private HashMap<Integer, String> games;
	private String currentStadiumLocation;
	private int week;
	private String opponent;
		
	public Games()
	{
		games = new HashMap<Integer, String>();
		
	}
			
		
	public void addGames(Integer week, String opponent, String currentStadiumLocation)
	{
		games.put(week, opponent);
		this.currentStadiumLocation = currentStadiumLocation;
	}
		
	//finds opponent for a given week(key)
	public String opponentByWeek(int week)
	{
		return games.get(week);
	}

	public double revenue()
	{
		return games.size() * stadiumSeats * ticketPrice;
	}

	public String toString()
	{
		return "Last game was played at " + currentStadiumLocation;
	}
}
