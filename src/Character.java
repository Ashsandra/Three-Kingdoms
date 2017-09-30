public class Character {
    private int hp;
    private String name;

    Character(int hp, String name){
        this.hp = hp;
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    void hurt() {
        hp--;
        System.out.println(this.name + "is hurt! Cries! The current HP of" + this.name + "is" + this.hp);
    }

    void recover() {
        hp ++;
        System.out.println(this.name +"recovers one HP");
    }


}
