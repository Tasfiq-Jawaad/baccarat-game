// TODO: Implement the Shoe class in this file

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shoe {
    private List<BaccaratCard> cards;

    public Shoe(int decks) {
        this.cards = new ArrayList<>();
        for (int i = 0; i < decks; i++) {
            for (Card.Suit suit : Card.Suit.values()) {
                for (Card.Rank rank : Card.Rank.values()) {
                    this.cards.add(new BaccaratCard(rank, suit));
                }
            }
        }
    }

    public int size() {
        return cards.size();
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public BaccaratCard deal() {
        if (cards.isEmpty()) {
            // Handle if the shoe is empty
            return null;
        }
        return cards.remove(0);
    }
}
