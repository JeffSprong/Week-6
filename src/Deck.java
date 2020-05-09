import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	List<Card> cards = new ArrayList<Card>();
	
	String[] name = {"Hearts", "Diamonds", "Clubs", "Spades"};
	
	public Deck() {
	
	for (int i = 0; i < 4; i++) {
		for (int j = 2; j < 15; j++) {
		cards.add(new Card (j,name[i]));	
	}
	}
	}
	
	public void shuffle () {
		
		Collections.shuffle(cards);			
	}

	 public Card draw () {
		 Card topCard = cards.get(0);
		 cards.remove(0);
		 return topCard;
		 
	 }

	
}