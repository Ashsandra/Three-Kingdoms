public abstract class Card {
  Integer rank;
  Suit suit;

  Card(int rank, Suit suit) {
    this.suit = suit;
    this.rank = rank;
  }

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
  public Suit getSuit() {
    return suit;
  }


  /**
   * Get the rank of the card.
   * @return integer rank
   */
  public int getRank() {
    return rank;
  }


  /**
   * Play a particular card. Do the appropriate changes to the game instance.
   * @return the new game instance.
   */
  abstract ThreeKingdoms play();


  /**
   * Check whether the card is of black color (spade/club).
   * @return a boolean
   */
  public boolean isBlack() {
    return getSuit().equals(Suit.CLUB) || getSuit().equals(Suit.SPADE);
  }

  /**
   * Check whether the card is of red color (heart/diamond).
   * @return a boolean
   */
  public boolean isRed() {
    return getSuit().equals(Suit.DIAMOND) || getSuit().equals(Suit.HEART);
  }


  public boolean isBasic() {
    //TODO: do I need this method?
    return this instanceof Basic;
  }
}



interface Basic {

  class Kill extends Card implements Basic {
    public Kill(int rank, Suit suit) {
      super(rank, suit);
    }

    @Override
    public ThreeKingdoms play() {
      //TODO: IMPLEMENT FOR KILL
      throw new UnsupportedOperationException("The method or operation is not implemented");
    }
  }


  class Dodge extends Card implements Basic {
    public Dodge(int rank, Suit suit) {
      super(rank, suit);
    }

    @Override
    public ThreeKingdoms play() {
      //TODO: IMPLEMENT FOR DODGE
      throw new UnsupportedOperationException("The method or operation is not implemented");
    }
  }


  class Peach extends Card implements Basic {
    public Peach(int rank, Suit suit) {
      super(rank, suit);
    }

    @Override
    public ThreeKingdoms play() {
      //TODO: IMPLEMENT FOR PEACH
      throw new UnsupportedOperationException("The method or operation is not implemented");
    }
  }

}


interface Weapon {

  

}
