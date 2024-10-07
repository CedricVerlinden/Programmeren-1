package Week4.HighScores;

import java.util.*;

public class HighScores {

	public static void main(String[] args) {
		Player player1 = new Player();
		Player player2 = new Player();
		Player player3 = new Player();

		player1.setName("Cédric");
		player2.setName("Jürn");
		player3.setName("Xander");

		player1.setScore(100);
		player2.setScore(200);
		player3.setScore(300);

		System.out.println("HIGHSCORES");
		System.out.println("----------");
		getHighScores(player1, player2, player3);
	}

	public static void getHighScores(Player player1, Player player2, Player player3) {
		Player[] players = {player1, player2, player3};

		Arrays.sort(players, Comparator.comparing(Player::getScore).reversed());
		for (Player player : players) {
			System.out.printf("%-7s %-3d%n", player.getName(), player.getScore());
		}
	}
}
