import java.lang.reflect.Array;
import java.util.ArrayList;

public class Player {
  private int handLimit;
  private ArrayList<Card> hand;
  private int hp;

  Player(Character character) {
    this.handLimit = character.getHp();
    this.hand = new ArrayList<Card>();
    this.hp = character.getHp();
  }

  public ArrayList<Card> getHand() {
    return this.hand;
  }

  public boolean hasCard(Card card) {
    return this.hand.contains(card);
  }

  public Card.Type play(Card card) {
    if (!hand.contains(card)) {
      System.out.println("Please only play a card that you have :)");
      return null;
    }

    System.out.println("You've played a " + card.getType());
    hand.remove(card);
    return card.getType();
  }
}
