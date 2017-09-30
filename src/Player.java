import java.lang.reflect.Array;
import java.util.ArrayList;

public class Player {
  private int handLimit;
  private ArrayList<Card> hand;
  private int blood;

  Player(Character character) {
    this.handLimit = character.getBlood();
    this.hand = new ArrayList<Card>();
    this.blood = character.getBlood();
  }


}
