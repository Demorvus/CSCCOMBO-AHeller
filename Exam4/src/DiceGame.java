
import java.util.Scanner;
public class DiceGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of sides for the die being used: ");
		int numSides = scanner.nextInt();
		System.out.print("Enter the number of players: ");
		int numPlayers = scanner.nextInt();

		Player[] players = new Player[numPlayers];

		for (int i = 0; i < numPlayers; i++) {
			System.out.print("Enter the name for player " + (i + 1) + ": ");
			String playerName = scanner.next();
			Die playerDie = new Die(numSides);
			players[i] = new Player(playerName, playerDie);
		}

		for (Player player : players) {
			player.getDie().roll();
			System.out.println("Player " + player.getName() + " rolled a " + player.getDie().getValue() + " on a "
					+ player.getDie().getNumSides() + " sided die");
		}

		int winnerIndex = decideWinner(players);
		System.out.println(players[winnerIndex].getName() + " won the game");
	}

	private static int decideWinner(Player[] players) {
		int max = Integer.MIN_VALUE;
		int winnerIndex = -1;

		for (int i = 0; i < players.length; i++) {
			if (players[i].getDie().getValue() > max) {
				max = players[i].getDie().getValue();
				winnerIndex = i;
			}
		}

		return winnerIndex;
	}
}