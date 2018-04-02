public class DeckTester {

	public static void main(String[] args) {
		Deck deck1 = new Deck(new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"}, new String[]{"Spades", "Hearts", "Diamonds", "Clubs"}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13});
		Deck deck2 = new Deck(new String[]{"X", "Y"}, new String[]{"Cyanide", "Regret"}, new int[]{12, 90});
		Deck deck3 = new Deck(new String[]{"Z"}, new String[]{"Send Help"}, new int[]{5});

		System.out.println(deck1.isEmpty());
		System.out.println(deck2.isEmpty());
		System.out.println(deck3.isEmpty());

		System.out.println(deck1.size());
		System.out.println(deck2.size());
		System.out.println(deck3.size());

		System.out.println(deck1.deal());
		System.out.println(deck2.deal());
		System.out.println(deck3.deal());

		System.out.println(deck1);
		System.out.println(deck2);
		System.out.println(deck3);		

	}
}
