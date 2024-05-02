public class BaccaratCard extends Card {

    public BaccaratCard(Rank r, Suit s) {
        super(r, s);
    }

    @Override
    public int value() {
        int rankValue = super.value();
        if (rankValue >= 10) {
            return 0; // Face cards and 10 have a value of 0 in Baccarat
        } else {
            return rankValue;
        }
    }
}