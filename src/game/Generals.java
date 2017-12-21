package src.game;

/**
 * Created by Ashsandra on 12/20/17.
 */
public abstract class Generals {
    Integer maxHp;
    Integer gender;

    Generals (int maxHp, int gender){
        this.maxHp = maxHp;
        this.gender = gender;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getGender () {
        return gender;
    }

}

class yueYing extends Generals {

}

class guanYu extends Generals {

}

class zhangFei extends Generals {

}

class zhugeLiang extends Generals {

}

class liuBei extends Generals {

}

class maChao extends Generals {

}

class zhaoYun extends Generals {

}

class sunQuan extends Generals {

}

class sunShangXiang extends Generals {

}

class ganNing extends Generals {

}

class huangGai extends Generals {

}

class luXun extends Generals {

}

class lvMeng extends Generals {

}

class zhouYu extends Generals {

}

class guoJia extends Generals {

}

class zhenJi extends Generals {

}

class caoCao extends Generals {

}

class siMaYi extends Generals {

}

class xiaHouDun extends Generals {

}

class zhangLiao extends Generals {

}

class xuChu extends Generals {

}

class lvBu extends Generals {

}

class diaoChan extends Generals {

}