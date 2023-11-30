import java.util.Arrays;

public class Card {
	private int rank;
	private int suit;
	private final String[] RANKS = { null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen",
			"King" };
	private final String[] SUITS = { "Spades", "Hearts", "Clubs", "Diamonds" };
	

	public Card(int rank, int suit) {
		this.rank = rank;
		this.suit = suit;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getSuit() {
		return suit;
	}

	public void setSuit(int suit) {
		this.suit = suit;
	}

	@Override
	public String toString() {
		String str = RANKS[rank] + " Type of " + SUITS[suit];
		return str;
	}

	public int compareTo(Card oCard) {
		if (suit > oCard.suit) {
			return 1;
		} else if (suit < oCard.suit) {
			return -1;
		}
		if (rank > oCard.rank) {
			return 1;
		} else if (rank < oCard.rank) {
			return -1;
		}
		return 0;
	}
}
