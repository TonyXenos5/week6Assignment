package automatedCardGameWar;

import java.util.ArrayList;
import java.util.List;

public class App {

	static List<String> dealOne = new ArrayList<String>();
	static List<String> dealTwo = new ArrayList<String>();
	static int currentRound = 0;

	public static void main(String[] args) {
		
		System.out.println("Welcome!! Let's play a game of War!\n");
		
		Deck.cardShuffle();
		
		final Player playerOne = new Player(null);
		final Player playerTwo = new Player(null);
		
		Deck.draw(playerOne, playerTwo);
		playWarGame(playerOne, playerTwo);
	}

	private static void playWarGame(Player playerOne, Player playerTwo) {
		
		int playerOneScore = 0;
		int playerTwoScore = 0;
		String card1value;
		String card2value;
		int numOfRounds = 25;

		Deck.draw(playerOne, playerTwo);
		
		for(int roundNum = numOfRounds; roundNum >= 0 ; roundNum--) {
			
			dealOne.get(roundNum);
			card1value = dealOne.get(roundNum);
			dealTwo.get(roundNum);
			card2value = dealTwo.get(roundNum);
			
			currentRound++;
			
			Player.describe(roundNum, card1value, card2value);
			
			Player.flip(roundNum);
			
			if(Player.card1 > Player.card2) {
				playerOneScore++;
			} else if(Player.card1 < Player.card2){
				playerTwoScore++;
			} // Ties result in no points being added to either score
			
			Player.incrementScore();
			
//			System.out.println("P1 Score: " + playerOneScore);
//			System.out.println("P2 Score: " + playerTwoScore);
		}
		
		System.out.println("\n-----------------------------------\n"
							+ "\nThe game of War is complete!\n\nFinal Scores\n"
							+ "\nPlayer 1: " + playerOneScore
							+ "\nPlayer 2: " + playerTwoScore + "\n");
		
		if(playerOneScore > playerTwoScore) {
			System.out.println("Player 1 has won the game of War!");
		} else if(playerOneScore < playerTwoScore) {
			System.out.println("Player 2 has won the game of War!");
		} else if(playerOneScore == playerTwoScore) {
			System.out.println("This game of War is a tie!");
		}
	}
}
