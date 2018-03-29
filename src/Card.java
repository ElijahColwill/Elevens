public class Card {

	private String suit;
	private String rank;
	private int pointValue;

	public Card(String cardRank, String cardSuit, int cardPointValue) {
		this.suit = cardSuit;
		this.rank = cardRank;
		this.pointValue = cardPointValue;
	}

	public String suit() {
		return suit;
   }

	public String rank() {
		return rank;
	}

	public int pointValue() {
		return pointValue;
	}

	public boolean matches(Card otherCard) {
		return otherCard.suit() == this.suit() && otherCard.rank() == this.rank() && otherCard.pointValue == this.pointValue;
	}

	@Override
	public String toString() {
		return rank + " of " + suit + "(point value = " + pointValue + ")";
	}
}
