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


// 基本牌
interface Basic {

  class Attack extends Card implements Basic {
    public Attack(int rank, Suit suit) {
      super(rank, suit);
    }

    @Override
    public ThreeKingdoms play() {
      //TODO: IMPLEMENT FOR Attack
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


// 武器牌
interface Weapon {

  /**
   * Get the attack range of the weapon.
   * @return an integer representing the range
   */
  int getAttackRange();


  // 诸葛连弩
  class ZhugeCrossbow extends Card implements Weapon {
    public ZhugeCrossbow(int rank, Suit suit) {
      super(rank, suit);
    }

    @Override
    public int getAttackRange() {
      return 1;
    }

    @Override
    public ThreeKingdoms play() {
      //TODO: IMPLEMENT FOR CROSSBOW
      throw new UnsupportedOperationException("The method or operation is not implemented");
    }
  }


  // 青釭剑
  class SwordofBlueSteel extends Card implements Weapon {
    public SwordofBlueSteel(int rank, Suit suit) {
      super(rank, suit);
    }

    @Override
    public int getAttackRange() {
      return 2;
    }

    @Override
    public ThreeKingdoms play() {
      //TODO: IMPLEMENT
      throw new UnsupportedOperationException("The method or operation is not implemented");
    }
  }


  // 寒冰剑
  class FrostBlade extends Card implements Weapon {
    public FrostBlade(int rank, Suit suit) {
      super(rank, suit);
    }

    @Override
    public int getAttackRange() {
      return 2;
    }

    @Override
    public ThreeKingdoms play() {
      //TODO: IMPLEMENT
      throw new UnsupportedOperationException("The method or operation is not implemented");
    }
  }


  // 贯石斧
  class RockCleavingAxe extends Card implements Weapon {
    public RockCleavingAxe(int rank, Suit suit) {
      super(rank, suit);
    }

    @Override
    public int getAttackRange() {
      return 3;
    }

    @Override
    public ThreeKingdoms play() {
      //TODO: IMPLEMENT
      throw new UnsupportedOperationException("The method or operation is not implemented");
    }
  }

}


// 防具牌
interface Armor {

}
