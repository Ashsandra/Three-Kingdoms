public class Character {
    private int hp;
    private int maxHp;
    private String name;

    Character(int hp, int maxHp, String name){
        this.hp = hp;
        this.maxHp = maxHp;
        this.name = name;
    }

    String setName() {
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

}