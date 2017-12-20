
package src;

public interface Card {

  enum Suit {
    SPADE,
    HEART,
    DIAMOND,
    CLUB
  }

  /**
   * Get the suit of the card.
   * @return the suit of the card as in the enum Suit.
   */
  Suit getSuit();


  /**
   * Get the rank of the card.
   * @return integer rank
   */
  int getRank();


  /**
   * Play a particular card. Do the appropriate changes to the game instance.
   * @return the new game instance.
   */
  ThreeKingdoms play();



  // 基本牌

  class Kill implements Card {
    Integer rank;
    Suit suit;

    private Kill(int rank, Suit suit) {
      this.suit = suit;
      this.rank = rank;
    }

    public Card makeKill(int rank, Suit suit) {
      return new Kill(rank, suit);
    }

    @Override
    public int getRank() {
      return rank;
    }

    @Override
    public Suit getSuit() {
      return suit;
    }


  }

  class Dodge implements Card {
    Integer rank;
    Suit suit;

    private Dodge(int rank, Suit suit) {
      this.suit = suit;
      this.rank = rank;
    }

    public Card makeDodge(int rank, Suit suit) {
      return new Dodge(rank, suit);
    }

    @Override
    public int getRank() {
      return rank;
    }

    @Override
    public Suit getSuit() {
      return suit;
    }

  }

  class Peach implements Card {
    Integer rank;
    Suit suit;

    private Peach(int rank, Suit suit) {
      this.suit = suit;
      this.rank = rank;
    }

    public Card makePeach(int rank, Suit suit) {
      return new Dodge(rank, suit);
    }

    @Override
    public int getRank() {
      return rank;
    }

    @Override
    public Suit getSuit() {
      return suit;
    }
    aaaa

  }




  interface Weapon extends Card {

  }

  interface Armor extends Card {

  }

  interface Horse extends Card {

  }

  interface Delay extends Card {

  }

  interface Undelay extends Card {

  }

}
