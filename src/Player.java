package src;

import src.Card;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Player {
  private int handLimit;
  private ArrayList<Card> hand;
  private int hp;
  private String name;

  Player(Character character) {
    this.handLimit = character.getHp();
    this.hand = new ArrayList<Card>();
    this.hp = character.getHp();
    this.name = character.getName();
  }

  public String getName() {return name;}

  public void setName(String name) {this.name = name;}

  public int getHp() {return hp;}

  public ArrayList<Card> getHand() {
    return this.hand;
  }

  public int getHandLimit() {return handLimit;}

  public boolean hasCard(Card.Type type) {
    for (Card card : hand) {
      if (card.getType() == type) {
        return true;
      }
    }
    return false;
  }

  boolean isDead () {
    return hp == 0;
  }

  boolean isAlive () {
    return ! isDead();
  }


  public void harm() {
    hp--;
    System.out.println(this.name + "受到1点伤害，体力值为" + hp);
  }

  public void heal() {
    if (hp < handLimit) {
      hp++;
      System.out.println(this.name + "回复一点体力，体力值为" + hp);
    } else {
      System.out.println(this.name + "体力值为满值" + hp);
    }
  }


  public Card.Type check(String i) {
    int index = Integer.parseInt(i);
    Card card = hand.get(index - 1);
    return card.getType();
  }


  public Card.Type play(String i) {
    int index = Integer.parseInt(i);
    Card card = hand.get(index - 1);
    System.out.println("You've played a " + card.getType());
    hand.remove(card);
    return card.getType();
  }

}
