package automatedCardGameWar;

public class Card {

	static int value; // Ace - King; 2-14
	private String name = "";
	
	public Card () {
	}
	
	public static void describe() {
		String[] cardSuit = {"Diamonds", "Hearts", "Spades", "Clubs"};
		String[] cardNum = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		
		for(int x = 0; x < cardNum.length; x++) {
			for(int y = 0; y < cardSuit.length; y++) {
				Deck.cards.add(cardNum[x] + " of " + cardSuit[y]);
			}
		}
	}
	
	public static int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		Card.value = Player.getScore();;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
		
}
