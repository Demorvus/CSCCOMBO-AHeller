
public class WarGame {

	public static void main(String[] args) {
		Deck deck = new Deck();

		deck.shuffle();

		Pile p1 = new Pile();
		Deck subDeck = deck.subDeck(1, 26);
		p1.addDeck(subDeck);

		Pile p2 = new Pile();
		subDeck = deck.subDeck(27, 52);
		p2.addDeck(subDeck);

		Pile midPile = new Pile();

		Pile winP1 = new Pile();

		Pile winP2 = new Pile();

		while (!p1.isEmpty() || !p2.isEmpty()) {
			Card c1 = p1.popCard();
			Card c2 = p2.popCard();

			midPile.addCard(c1);
			midPile.addCard(c2);
			int cmpResult = c1.compareTo(c2);

			if (cmpResult > 0) {
				winP1.addPile(midPile);
			} else if (cmpResult < 0) {
				winP2.addPile(midPile);
			}
		}
		/////// Cards are spent/////////
		if (winP1.size() > winP2.size()) {
			System.out.println("Player 1 wins");
		} else if (winP1.size() > winP2.size()) {
			System.out.println("Player 2 wins");
		} else if (winP1.size() > winP2.size()) {
			System.out.println("Player 2 wins");
		}
//		Card card1 = new Card(11, 0);
//		System.out.println(card1);
//		Deck deck = new Deck();
//		System.out.println(deck);
//		System.out.println();
//
//		deck.shuffle();
//
//		System.out.println();
//		System.out.println(deck);
//		
//		deck.bubbleSort();
//
//		System.out.println();
//		System.out.println(deck);
//
//		Pile pile = new Pile();
//		pile.addCard(deck.getCards()[0]);
//		pile.addCard(deck.getCards()[1]);
//		pile.addCard(deck.getCards()[2]);
//		pile.addCard(deck.getCards()[3]);
//		
//		System.out.println(pile);
//		pile.popCard(card1);
//		System.out.println(pile);
//
//	
//	Deck hand = deck.subDeck(0,13);
//	
//	Pile p1 = new Pile ();
//	p1.addDeck(hand);
//	

	}
}