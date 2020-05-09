import java.util.ArrayList;
import java.util.List;

public class Player {
	
	
	List<Card> hand = new ArrayList<Card>();
	int score;
	String name;
	
	public Player () {}
	
	public Player (String name) {
		this.name = name;
		int score = 0;		
	}
	
	public void describe () {
		System.out.println("Player : " + name);
		for (Card card: hand) {
			card.describe();
	}
	}
	
	public Card flip () {
		Card flippedCard = hand.get(0);
		hand.remove(0);
		return flippedCard;
	}
	
	public void draw (Deck deck) {
		hand.add(deck.draw());
	}
	
	public void incrementScore () {
		score++;
	}

}
