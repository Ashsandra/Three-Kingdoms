public class Card {
  private Suit suit;
  private int rank;
  private Type type;

  Card(Suit suit, int rank, Type type) {
    this.suit = suit;
    this.rank = rank;
    this.type = type;
  }

  public enum Suit {
    SPADE,
    HEART,
    DIAMOND,
    CLUB;
  }

  public enum Type {
    KILL,
    DODGE,
    PEACH;
  }

  public Suit getSuit() { return suit;}

  public int getRank() {return rank;}

  public Type getType() {return type;}

  public boolean isRed() {return this.suit == Suit.SPADE | this.suit == Suit.CLUB;}

  public boolean isBlack() {return this.suit == Suit.HEART | this.suit == Suit.DIAMOND;}

  public String toString() {return type.toString();}
}
