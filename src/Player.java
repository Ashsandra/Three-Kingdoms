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


}
