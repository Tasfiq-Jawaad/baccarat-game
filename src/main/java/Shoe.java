// TODO: Implement the Shoe class in this file

import java.util.Collections;

public class Shoe extends CardCollection{
    public Shoe(int decks) {
        super();
        if (decks != 6 && decks != 8) {
            throw new CardException("Invalid number of decks. Only 6 or 8 decks are allowed.");
        }
        
        for (int i = 0; i < decks; i++) {
            for (Card.Suit suit : Card.Suit.values()) {
                for (Card.Rank rank : Card.Rank.values()) {
                    super.add(new BaccaratCard(rank, suit));
                }
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public BaccaratCard deal() {
        if (super.isEmpty()) {
            throw new CardException("The shoe is empty. Cannot deal a card.");
        }
        return (BaccaratCard) cards.remove(0);
    }
}
