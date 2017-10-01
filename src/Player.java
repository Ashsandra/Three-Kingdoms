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

  public boolean hasCard(Card.Type type) {
    for (Card card : hand) {
      if (card.getType() == type) {
        return true;
      }
    }
    return false;
  }


  public Card.Type play(int index) {
    Card card = hand.get(index - 1);
    System.out.println("You've played a " + card.getType());
    hand.remove(card);
    return card.getType();
  }
}
