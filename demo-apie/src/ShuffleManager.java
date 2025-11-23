import java.util.Random;

public class ShuffleManager {
  private Deck deck;

  public ShuffleManager(Deck deck) {
    this.deck = deck; 
  }

  public void shuffle() {
    Card[] newCards = new Card[deck.getCards().length];
    int idx = 0;
    for (int i=0; i < 100; i++) { //100times
      // random idx (20-40)
      //pick 10 cards in middle
      int randomInx = new Random().nextInt(21) + 20;

      for (int j = randomInx; j < randomInx + 10; j++) {
        newCards[idx++] = deck.getCards()[j];
      }
      for (int j = randomInx + 10; j <deck.getCards().length; j++) {
        newCards[idx++] = deck.getCards()[j];
      }
      deck.setCards(newCards); //最後拎返洗完既牌出黎
    }
    }

  public static void main(String[] args) {
    Deck d1 = new Deck();
      ShuffleManager sm = new ShuffleManager(d1);
      sm.shuffle();
      //System.out.println(d1.getCards());
  }
}

