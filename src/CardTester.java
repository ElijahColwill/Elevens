public class CardTester {

	public static void main(String[] args) {
		Card card1 = new Card("King", "Hearts", 13);
		Card card2 = new Card("Queen", "Hearts", 12);
		Card card3 = new Card("4", "Spades", 4);

		System.out.println(card1.suit());
		System.out.println(card2.suit());
		System.out.println(card3.suit());

		System.out.println(card1.rank());
		System.out.println(card2.rank());
		System.out.println(card3.rank());

		System.out.println(card1.pointValue());
		System.out.println(card2.pointValue());
		System.out.println(card3.pointValue());

		System.out.println(card1.matches(card2));
		System.out.println(card2.matches(card1));
		System.out.println(card3.matches(card3));

		System.out.println(card1.toString());
		System.out.println(card2.toString());
		System.out.println(card3.toString());

	}
}
