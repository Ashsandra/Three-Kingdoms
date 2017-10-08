public class Card {
  private Suit suit;
  private int rank;
  private Type type;
  private StrategyType strategyType;
  private BasicType basicType;
  private WeaponType weaponType;

  Card(Suit suit, int rank, Type type, StrategyType strategyType, WeaponType weaponType, BasicType basicType) {
    this.suit = suit;
    this.rank = rank;
    this.type = type;
    this.strategyType = strategyType;
    this.weaponType = weaponType;
    this.basicType = basicType;

  }

  public enum Suit {
    SPADE,
    HEART,
    DIAMOND,
    CLUB
  }

  public enum Type {
    BASIC,
    STRATEGY,
    WEAPON
  }

  public enum BasicType {
    KILL,
    Dodge,
    PEACH
  }

  public enum StrategyType {
    SAVAGE_ASSAULT,
    ARROW_RAIN,
    RITUAL_TO_FRATERNITY,
    ALL_OUT_OF_NONE,
    THEFT,
    GIVE_ME_YOUR_WEAPON,
    SABOTAGE,
    DUEL,
    HARVEST,
    DRAWN_IN_HAPPINESS,
    LIGHTNING,
    FLAWLESS_DEFENSE
  }

  public enum WeaponType {
    ZHUGE_CROSSBOW,
      QINGGANG_SWORD,
      QINGLONG_DAO,
      ZHANGBA_MAO,
      CIXIONG_SWROD,
      FANGTIAN_JI,
      GUANSHI_AXE,
      QILIN_ARROW,
      HANBIN_SWORD,
      BAGUA_ZHEN,
      RENWANG_DUN,
      AGGRESIVE_HORSE,
      DEFENSIVE_HORSE

  }
    public Suit getSuit() { return suit;}

    public int getRank() {return rank;}

    public Type getType() {return type;}

    public StrategyType getStrategyType() {
      return strategyType;
    }

    public boolean isRed() {return this.suit == Suit.SPADE | this.suit == Suit.CLUB;}

    public boolean isBlack() {return this.suit == Suit.HEART | this.suit == Suit.DIAMOND;}

    public String toString() {return type.toString();}

}
