import java.util.ArrayList;
import java.util.List;

public class BaccaratHand extends CardCollection {

    public BaccaratHand() {
        super();
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Card card : cards) {
            result.append(card.toString()).append(" "); // Append a space after each card
        }
        return result.toString().trim(); // Trim to remove any trailing space
    }

    public int value() {
        return super.value() % 10;
    }

    public boolean isNatural() {
        return size() == 2 && value() >= 8;
    }

}