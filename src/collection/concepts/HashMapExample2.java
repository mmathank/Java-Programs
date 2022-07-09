package core.java.collection.concepts;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
	
	static Map<CricketPlayer, String> playerMap = new HashMap<>();

	public static void main(String[] args) {

		CricketPlayer player1 = new CricketPlayer("Sachin");
		CricketPlayer player2 = new CricketPlayer("Dravid");
		CricketPlayer player3 = new CricketPlayer("Smith");
		CricketPlayer player4 = new CricketPlayer("Sachin");
		
		playerMap.put(player1, "India");
		playerMap.put(player2, "India");
		playerMap.put(player3, "Australia");
		playerMap.put(player4, "India");
		
		for(Map.Entry<CricketPlayer, String> en : playerMap.entrySet()) {
			System.out.println("Player: " + en.getKey() + " || " + "Country: " + en.getValue());
		}
	
	}

}
