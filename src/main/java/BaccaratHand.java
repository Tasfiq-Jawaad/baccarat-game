public class BaccaratHand extends CardCollection {

    public BaccaratHand() {
        super();
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Card card : cards) {
            result.append(card.toString()).append(" ");
        }
        return result.toString().trim();
    }

    public int value() {
        return super.value() % 10;
    }

    public boolean isNatural() {
        return size() == 2 && value() >= 8;
    }

}