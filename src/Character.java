public class Character {
    private int blood;
    private String name;

    Character(int blood, String name){
        this.blood = blood;
        this.name = name;
    }

    void setBlood(int initBlood){
        blood = initBlood;
    }

    public int getBlood() {
        return blood;
    }

    void hurt() {
        blood--;
        System.out.println(this.name + "is hurt! Cries! The current blood of" + this.name + "is" + this.blood);
    }

    void recover() {
        blood ++;
        System.out.println(this.name +"recovers one blood");
    }


}
