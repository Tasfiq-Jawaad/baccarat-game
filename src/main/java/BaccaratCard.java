public class BaccaratCard extends Card {

    public BaccaratCard(Rank r, Suit s) {
        super(r, s);
    }

    @Override
    public int value() {
        int rankValue = super.value();
        if (rankValue >= 10) {
            return 0; 
        } else {
            return rankValue;
        }
    }
}