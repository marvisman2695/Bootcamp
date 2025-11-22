public class HandManager {
  private Card[] cards;

  public HandManager(Card[]cards) {
    // if card.length != 5, throw exception
    this.cards = cards;
  }
  public boolean withEmptyCard() {
    return cards[0] == null || cards[1] == null//
    || cards[2] == null || cards[3] == null 
    || cards[4] == null;  
  }

  public boolean isFullHouse() {
    // Algorithm
    if (withEmptyCard())
      return false;
    int[] boxes = new int [13]; //13 Ranks in total
    for (Card card : this.cards) {
      boxes[card.getRank().getValue()-1]++;
    }
    //searching 
    // one 3, one 2, eleven 0
    int threeCount = 0;
    int twoCount = 0;
    int zeroCount = 0;
    for (int i =0; i <13; i++) {
      if (boxes[i] ==0) {
        zeroCount++;
        continue;}
          if (boxes[i] ==2)
        twoCount++;
            if (boxes[i] ==3)
        threeCount++;
  }
  return zeroCount == 11 && twoCount ==1 && threeCount == 1;
}

public static void main(String[] args) {
Card[] hand1 = new Card[] { //
  new Card(Suite.CLUB,Rank.ACE)
  ,new Card(Suite.CLUB,Rank.FOUR)
  , new Card(Suite.SPADE,Rank.ACE)
  , new Card(Suite.HEART,Rank.ACE)
  , new Card(Suite.DIAMOND,Rank.FOUR) 
};
HandManager hm = new HandManager(hand1);
System.out.println(hm.isFullHouse());

}

}
}