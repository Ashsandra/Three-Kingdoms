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

    int getHp() {
        return hp;
    }

    int getMaxHp() {
        return maxHp;
    }

    int getLosthp() {
        return maxHp - hp;
    }

    boolean isWounded() {
        return getLosthp() > 0;
    }

    boolean isDead() {
        return hp == 0;
    }

    boolean isAlive() {
        return ! isDead();
    }

    void harm() {
        hp --;
        System.out.println(this.name + "受到1点伤害，体力值为" + hp);
    }

    void heal() {
        hp ++;
        System.out.println(this.name + "回复一点体力，体力值为" + hp);
    }

    void dying() {
        Scanner scanner = new Scanner(System.in);
        if (hp == 0) {
            System.out.println(this.name + "处于濒死状态，是否出一个桃");
            System.out.println("(1)-- Yes");
            System.out.println("(2)--No");
            int selection = scanner.nextInt();
            if (selection == 1 && player.hasCard(Card.Type.PEACH)){
                isAlive();
                System.out.println("game continues!");
                if (selection == 2){
                    isDead();
                    System.out.println("game ends");
                }
            }

        }
    }
}