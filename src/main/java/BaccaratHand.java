import java.util.ArrayList;
import java.util.List;

public class BaccaratHand extends CardCollection {

    // private List<BaccaratCard> cards;

    public BaccaratHand() {
        super();
        // this.cards = new ArrayList<>();
    }

    // public void add(BaccaratCard card) {
    //     cards.add(card);
    // }

    // complete
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Card card : cards) {
            result.append(card.toString()).append(" "); // Append a space after each card
        }
        return result.toString().trim(); // Trim to remove any trailing space
    }

    public int value() {
        // int totalValue = 0;
        // for (BaccaratCard card : cards) {
        //     totalValue += card.value();
        // }
        return super.value() % 10;
    }

    public boolean isNatural() {
        return size() == 2 && value() >= 8;
    }

}

// public int value() {
// int totalValue = 0;
// for (Card card : cards) {
// totalValue += card.value();
// }
// return totalValue % 10;
// }

// @Override
// public String toString() {
// StringBuilder result = new StringBuilder();
// for (Card card : cards) {
// result.append(card.toString()).append(" "); // Append a space after each card
// }
// return result.toString().trim(); // Trim to remove any trailing space
// }

// private List<Card> cards;

// public BaccaratHand() {
// this.cards = new ArrayList<>();
// }

// public int size() {
// return cards.size();
// }

// public void add(Card card) {
// cards.add(card);
// }

// public int value() {
// int totalValue = 0;
// for (Card card : cards) {
// totalValue += card.value();
// }
// return totalValue % 10;
// }

// public boolean isNatural() {
// return size() == 2 && value() >= 8;
// }

// @Override
// public String toString() {
// StringBuilder result = new StringBuilder();
// for (Card card : cards) {
// result.append(card.toString()).append(" "); // Append a space after each card
// }
// return result.toString().trim(); // Trim to remove any trailing space
// }