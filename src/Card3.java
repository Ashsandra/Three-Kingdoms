

public interface Card3 {

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


  /**
   * Check whether the card is of black color (spade/club).
   * @return a boolean
   */
  default boolean isBlack() {
    return getSuit().equals(Suit.CLUB) || getSuit().equals(Suit.SPADE);
  }

  /**
   * Check whether the card is of red color (heart/diamond).
   * @return a boolean
   */
  default boolean isRed() {
    return getSuit().equals(Suit.DIAMOND) || getSuit().equals(Suit.HEART);
  }






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

    @Override
    public ThreeKingdoms play() {
      //TODO: IMPLEMENT FOR KILL
      throw new UnsupportedOperationException("The method or operation is not implemented");
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

    @Override
    public ThreeKingdoms play() {
      //TODO: IMPLEMENT FOR DODGE
      throw new UnsupportedOperationException("The method or operation is not implemented");
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

    @Override
    public ThreeKingdoms play() {
      //TODO: IMPLEMENT FOR PEACH
      throw new UnsupportedOperationException("The method or operation is not implemented");
    }


  }




  interface Weapon extends Card {

    class Zhugeliannu implements Weapon {
      Integer rank;
      Suit suit;

    private Zhugeliannu(int rank, Suit suit) {
        this.suit = suit;
        this.rank = rank;
      }

      public Card makeZhugeliannu(int rank, Suit suit) {
        return new Zhugeliannu(rank, suit);
      }

      @Override
      public int getRank() {
        return rank;
      }

      @Override
      public Suit getSuit() {
        return suit;
      }

      @Override
      public ThreeKingdoms play() {
        //TODO: IMPLEMENT FOR WEAPON
        throw new UnsupportedOperationException("The method or operation is not implemented");
      }
    }

    class Qinggangjian implements Weapon {
      Integer rank;
      Suit suit;

      private Qinggangjian(int rank, Suit suit) {
        this.suit = suit;
        this.rank = rank;
      }

      public Card makeQinggangjian(int rank, Suit suit) {
        return new Zhugeliannu(rank, suit);
      }

      @Override
      public int getRank() {
        return rank;
      }

      @Override
      public Suit getSuit() {
        return suit;
      }

      @Override
      public ThreeKingdoms play() {
        //TODO: IMPLEMENT FOR WEAPON
        throw new UnsupportedOperationException("The method or operation is not implemented");
      }

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
