import java.util.ArrayList;
import java.util.Scanner;

public class Character {
    private int hp;
    private int maxHp;
    private String name;
    Player player;
    Card card;

    Character(int maxHp, String name){
        this.hp = maxHp;
        this.maxHp = maxHp;
        this.name = name;
    }

    void setName(String name) {
        this.name = name;
    }

  public String getName() {
    return name;
  }

  int getHp() {
        return hp;
    }

    int getMaxHp() {
        return maxHp;
    }

    int getLosthp() {
        return maxHp - hp;
    }

    boolean isWounded () {
        return getLosthp() > 0;
        }

    }

