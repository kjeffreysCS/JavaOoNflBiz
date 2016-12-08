package edu.albany.FinalProject;

public class NflTester {

	public static void main(String[] args) {
		//Creates an nfl team called the patriots
		NflFranchise Patriots = new NflFranchise();
		
		//sets  and prints location of the Patriots franchise to New England
		Patriots.setLocation("New England");
		System.out.println(Patriots.getLocation());
		
		//sets and prints the stadium name of the patriots
		Patriots.setStadium("Gillete Stadium");
		System.out.println(Patriots.getStadium());
		
		//sets and prints the value of the patriots organization
		Patriots.setValue(2000000000);
		System.out.println(Patriots.getValue());
		
		//Creates and displays info about the patriots owner
		Owner patriotsOwner = new Owner("Robert", "Kraft", 1000000.00, "Patriots", "CEO");
		System.out.println(patriotsOwner.toString());
		
		//Create games for the schedule, then display them
		Games one = new Games();
		one.addGames(1, "Jets", "Gilette");
		Games two = new Games();
		two.addGames(2, "Dolphins", "Sun Life");
		Patriots.setSchedule(one);
		Patriots.setSchedule(two);

		Patriots.printSchedule();
		
		//Create a roster
		Roster<Player> patsRoster = new Roster<Player>();
		
		//Create players to add to the roster
		Player first = new Player("Cyrus","Jones", 500000.00, "Patriots", "Player", "Cornerback");
		Player second = new Player("Chandler","Jones", 6000000.00, "Patriots", "Player", "Defensive End");
		Player third = new Player("Jonathon","Ogletree", 280000.00, "Patriots", "Player", "Left Guard");

		//Draft two players to roster, and then make a trade
		patsRoster.draft(first);
		patsRoster.draft(second);
		Patriots.addRoster(patsRoster);
		Patriots.getRoster();
		
		patsRoster.trade(second, third);
		
		Patriots.addRoster(patsRoster);
		Patriots.getRoster();
		
		
		
	}

}
