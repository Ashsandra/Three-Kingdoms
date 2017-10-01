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

    boolean isDead () {
        return hp == 0;
    }

    boolean isAlive () {
        return ! isDead();
    }

    void harm () {
        hp --;
        System.out.println(this.name + "受到1点伤害，体力值为" + hp);
    }

    void heal () {
        hp ++;
        System.out.println(this.name + "回复一点体力，体力值为" + hp);
    }

    void dying() {
        Scanner scanner = new Scanner(System.in);
        if (hp == 0) {
            System.out.println (this.name +"属于濒死状态，是否使用一个桃");
            System.out.println("(1)--确定");
            System.out.println("(2)--取消");
            int selection = scanner.nextInt();

            if (selection == 1 && player.hasCard(card)){
                isAlive();
                System.out.println("you are alive!");
            }
            if (selection == 2){
                isDead();
                System.out.println("you are dead!");
            }


        }
    }

    }

