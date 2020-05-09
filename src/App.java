
public class App {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		Player player1 = new Player();
		Player player2 = new Player();
		
		deck.shuffle();
		
		for (int i =0 ; i < 26; i++) {
			player1.draw(deck);
			player2.draw(deck);
		}
		
		for (int i = 0; i < 26; i++) {
			Card card1 = player1.flip();
			Card card2 = player2.flip();
			System.out.println(card1.describe() + " vs. " + card2.describe());
			
			if (card1.getValue() > card2.getValue()) {
				player1.incrementScore();
			} else {
				player2.incrementScore();
			}
			
		}
			System.out.println("Player 1 score was " + player1.score + " and Player 2 score was " + player2.score);
		
			if (player1.score > player2.score) {
				System.out.println("Player 1 wins!");
				
			} else if (player2.score > player1.score) {
				System.out.println("Player 2 wins!");
				
			} 
			
			else
				System.out.println("It was a Draw!");

}
}
