public class BaccaratCard extends Card {

    public BaccaratCard(Rank r, Suit s) {
        super(r, s);
    }

    @Override
    public int value() {
        // Baccarat card value calculation
//        int value = getRank().ordinal(); // Rank value starts from 0, so add 1
//        return Math.min(value, 10); // Limit the maximum value to 10
        return super.value();
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
