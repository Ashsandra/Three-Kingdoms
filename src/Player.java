import java.lang.reflect.Array;
import java.util.ArrayList;

public class Player {
  private int handLimit;
  private ArrayList<String> hand;
  private int blood;

  Player(Character character) {
    this.handLimit = character.getBlood();
    this.hand = new ArrayList<String>();
    this.blood = character.getBlood();
  }

  
}
