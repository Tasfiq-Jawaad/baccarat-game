import java.util.ArrayList;
import java.util.List;

public class Baccarat {
  public static void main(String[] args) {
    Shoe shoe = new Shoe(6);

    shoe.shuffle();

    // Create hands for the banker and the player
    BaccaratHand bankerHand = new BaccaratHand();
    BaccaratHand playerHand = new BaccaratHand();

    // Deal a card to the player
    // Deal two cards to each hand
    for (int i = 0; i < 2; i++) {
      playerHand.add(shoe.deal());
      bankerHand.add(shoe.deal());
    }

    System.out.println("Player: " + playerHand + " = " + playerHand.value());
    System.out.println("banker: " + bankerHand + " = " + bankerHand.value());

    // checlk if either hand is a natural
    if (playerHand.isNatural() && bankerHand.isNatural()) {
      System.out.println("Both Player and Banker has a natural\n");
    } else if (playerHand.isNatural()) {
      System.out.println("Player has a natural\n");
    } else if (bankerHand.isNatural()) {
      System.out.println("Banker has a natural\n");
    }
    else{
      System.out.println("Neither the Player nor the Banker has a natural\n");
    }
  }
}
