package core.java.basics;

import java.util.ArrayList;
import java.util.List;

public class NestedStaticClass {

	String teamName;
	List<Player> players;

	public NestedStaticClass(String teamName, List<Player> players) {
		this.teamName = teamName;
		this.players = players;
	}

	static class Player {

		String playerName;
		String playerCountry;

		public Player(String playerName, String playerCountry) {
			super();
			this.playerName = playerName;
			this.playerCountry = playerCountry;
		}

		@Override
		public String toString() {
			return "Player [playerName=" + playerName + ", playerCountry=" + playerCountry + "]";
		}
	}

	@Override
	public String toString() {
		return "NestedStaticClass [teamName=" + teamName + ", players=" + players + "]";
	}

	public static void main(String[] args) {

		String teamName = "CSK";

		NestedStaticClass.Player player1 = new NestedStaticClass.Player("Dhoni", "India");
		NestedStaticClass.Player player2 = new NestedStaticClass.Player("Malinga", "SriLanka");

		List<Player> players = new ArrayList<>();
		players.add(player1);
		players.add(player2);

		NestedStaticClass nsc = new NestedStaticClass(teamName, players);
		System.out.println(nsc);

		String name = players.get(0).playerName;
		System.out.println("1st Player Name: " + name);

		String country = players.get(1).playerCountry;
		System.out.println("2nd Player from: " + country);
	}
}
