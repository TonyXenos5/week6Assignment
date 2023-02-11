package automatedCardGameWar;

import java.util.ArrayList;
import java.util.List;

public class Player {

	static List<String> hand = new ArrayList<String>();
	static int score;
	private String name;
	static int card1 = 0;
	static int card2 = 0;
	
	public Player(String name) {
		this.name = name;
	}
	
	public void Draw(int dealCards) {
	
		for (int dealerCards = 0; dealerCards < hand.size(); dealerCards++) {
			hand.add(Deck.cards.get(dealerCards));
			Deck.cards.remove(dealerCards);
			dealerCards--;
		}
 	}
	
	public static int getScore() {
		return score;
	}

	public static void setScore(int score) {
		Player.score = score;
	}

	public String getName(Player player) {
		return name;
	}

	static void Score(String card) {
		if(card.equals("Ace of Diamonds") || card.equals("Ace of Hearts") || card.equals("Ace of Spades") || card.equals("Ace of Clubs")) {
			setScore(2);
		} else if(card.equals("Two of Diamonds") || card.equals("Two of Hearts") || card.equals("Two of Spades") || card.equals("Two of Clubs")) {
			setScore(3);
		} else if(card.equals("Three of Diamonds") || card.equals("Three of Hearts") || card.equals("Three of Spades") || card.equals("Three of Clubs")) {
			setScore(4);
		} else if(card.equals("Four of Diamonds") || card.equals("Four of Hearts") || card.equals("Four of Spades") || card.equals("Four of Clubs")) {
			setScore(5);
		} else if(card.equals("Five of Diamonds") || card.equals("Five of Hearts") || card.equals("Five of Spades") || card.equals("Five of Clubs")) {
			setScore(6);
		} else if(card.equals("Six of Diamonds") || card.equals("Six of Hearts") || card.equals("Six of Spades") || card.equals("Six of Clubs")) {
			setScore(7);
		} else if(card.equals("Seven of Diamonds") || card.equals("Seven of Hearts") || card.equals("Seven of Spades") || card.equals("Seven of Clubs")) {
			setScore(8);
		} else if(card.equals("Eight of Diamonds") || card.equals("Eight of Hearts") || card.equals("Eight of Spades") || card.equals("Eight of Clubs")) {
			setScore(9);
		} else if(card.equals("Nine of Diamonds") || card.equals("Nine of Hearts") || card.equals("Nine of Spades") || card.equals("Nine of Clubs")) {
			setScore(10);
		} else if(card.equals("Ten of Diamonds") || card.equals("Ten of Hearts") || card.equals("Ten of Spades") || card.equals("Ten of Clubs")) {
			setScore(11);
		} else if(card.equals("Jack of Diamonds") || card.equals("Jack of Hearts") || card.equals("Jack of Spades") || card.equals("Jack of Clubs")) {
			setScore(12);
		} else if(card.equals("Queen of Diamonds") || card.equals("Queen of Hearts") || card.equals("Queen of Spades") || card.equals("Queen of Clubs")) {
			setScore(13);
		} else if(card.equals("King of Diamonds") || card.equals("King of Hearts") || card.equals("King of Spades") || card.equals("King of Clubs")) {
			setScore(14);
		} else {
			setScore(0);
		}
	}
	
	static void describe(int turnNum, String card1value, String card2value) {
		
		int currentTurn = App.currentRound;
		
		System.out.println("\nIt is Round " + currentTurn + "!");
		System.out.println("Player One put down: " + App.dealOne.get(turnNum));
		System.out.println("Player Two put down: " + App.dealTwo.get(turnNum));
			
		Player.Score(card1value);
		card1 = score;
		Player.Score(card2value);
		card2 = score;
		
	}
	
	static void flip(int uno) {
			App.dealOne.remove(uno);
			App.dealTwo.remove(uno);
	}
	
	public static void incrementScore() {
		
		int turn = App.currentRound;
		
		if (card1 != card2) {
			if (card1 > card2) {
				System.out.println("\nRound " + turn + " goes to Player 1!");
			} else {
				System.out.println("\nRound " + turn + " goes to Player 2!");
			}
		} else if (card1 == card2) {
			System.out.println("\nRound " + turn + " is a Tie!");
		}
		
	}
	
}
