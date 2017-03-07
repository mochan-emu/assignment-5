
import cards.*;

// Application for generating random cards
public class CardApp 
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter the number of cards to generate:");

		Card c = new Card(10, Card.Suit.Heart);
		System.out.println(c.getSuitSymbol());
		c.setSuit(Card.getSuitFromIndex(3));
		System.out.println(c.getSuitSymbol());
	}
}
