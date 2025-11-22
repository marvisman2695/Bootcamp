//!enum
public class Card {
  private Suite suite; //DIAMOND. CLUB, HEART, SPADE
  private Rank rank; // A, 2, 3, .....J, Q, K

  public Card(Suite suite, Rank rank){
    this.suite = suite;
    this.rank = rank;
  }

  @Override  // Call緊祖先
    public String toString() {
      return "Card(" //
      + "suite=" + this.suite
      + ",rank=" + this.rank
      +")";
    }

    public Suite getSuite(){
      return this.suite;
    }

    public Rank getRank() {
      return this.rank;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj)
      return true;
      if (!(obj instanceof Card))
      return false;
      Card card = (Card) obj;
  return Object.equals(this.suite, card.getSuite())
    && Object.equals(this.rank, card.getRank());
    }


    //hashCode()
@Override
public int hashCode() {
  return Object.hash(this.suite, this.rank);
}
  //constructor, getter
  public static void main(String[] args) {
      //52 cards
      //Deck.java
      Deck deck = new Deck();
    System.out.println(Array.toString(deck.getCards()));
  }
}
