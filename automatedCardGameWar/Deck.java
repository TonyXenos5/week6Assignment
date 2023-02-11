package automatedCardGameWar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	static List<String> cards = new ArrayList<String>();
	
	public static void cardShuffle() {
		Card.describe();
		Collections.shuffle(cards);
	}
	
	static void draw(Player playerOne, Player playerTwo) {
			
		for(int dealer = 0; dealer < Deck.cards.size(); dealer++) {
			
			if(App.dealOne.size() == (Deck.cards.size()/2) && App.dealTwo.size() == (Deck.cards.size()/2)) {
				break;
			}
			playerOne.Draw(dealer);
			App.dealOne.add(Deck.cards.get(dealer));
			dealer++;
			playerTwo.Draw(dealer);
			App.dealTwo.add(Deck.cards.get(dealer));
		}
	}
}
