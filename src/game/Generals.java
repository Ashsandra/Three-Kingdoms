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
    @Override
    public int getMaxHp() {
        return 3;
    }

    @Override
    public int getGender() {
        return 1;
    }
}

class guanYu extends Generals {
    @Override
    public int getMaxHp() {
        return 4;
    }
    @Override
    public int getGender() {
        return 0;
    }
}

class zhangFei extends Generals {
    @Override
    public int getMaxHp() {
        return 4;
    }
    @Override
    public int getGender() {
        return 0;
    }

}

class zhugeLiang extends Generals {
    @Override
    public int getMaxHp() {
        return 3;
    }
    @Override
    public int getGender() {
        return 0;
    }

}

class liuBei extends Generals {
    @Override
    public int getMaxHp() {
        return 4;
    }
    @Override
    public int getGender() {
        return 0;
    }

}

class maChao extends Generals {
        @Override
        public int getMaxHp() {
            return 4;
        }
    @Override
    public int getGender() {
        return 0;
    }

}

class zhaoYun extends Generals {
    @Override
    public int getMaxHp() {
        return 4;
    }
    @Override
    public int getGender() {
        return 0;
    }

}

class sunQuan extends Generals {
    @Override
    public int getMaxHp() {
        return 4;
    }
    @Override
    public int getGender() {
        return 0;
    }

}

class sunShangXiang extends Generals {
    @Override
    public int getMaxHp() {
        return 3;
    }
    @Override
    public int getGender() {
        return 1;
    }

}

class ganNing extends Generals {
    @Override
    public int getMaxHp() {
        return 4;
    }
    @Override
    public int getGender() {
        return 0;
    }

}

class huangGai extends Generals {
    @Override
    public int getMaxHp() {
        return 4;
    }
    @Override
    public int getGender() {
        return 0;
    }

}

class luXun extends Generals {
    @Override
    public int getMaxHp() {
        return 3;
    }
    @Override
    public int getGender() {
        return 0;
    }

}

class lvMeng extends Generals {
    @Override
    public int getMaxHp() {
        return 4;
    }
    @Override
    public int getGender() {
        return 0;
    }

}

class zhouYu extends Generals {
    @Override
    public int getMaxHp() {
        return 3;
    }

}

class guoJia extends Generals {
    @Override
    public int getMaxHp() {
        return 3;
    }
    @Override
    public int getGender() {
        return 0;
    }

}

class zhenJi extends Generals {
    @Override
    public int getMaxHp() {
        return 3;
    }
    @Override
    public int getGender() {
        return 1;
    }

}

class caoCao extends Generals {
    @Override
    public int getMaxHp() {
        return 4;
    }
    @Override
    public int getGender() {
        return 0;
    }

}

class siMaYi extends Generals {
    @Override
    public int getMaxHp() {
        return 3;
    }
    @Override
    public int getGender() {
        return 0;
    }

}

class xiaHouDun extends Generals {
    @Override
    public int getMaxHp() {
        return 4;
    }
    @Override
    public int getGender() {
        return 0;
    }

}

class zhangLiao extends Generals {
    @Override
    public int getMaxHp() {
        return 4;
    }
    @Override
    public int getGender() {
        return 0;
    }

}

class xuChu extends Generals {
    @Override
    public int getMaxHp() {
        return 4;
    }
    @Override
    public int getGender() {
        return 0;
    }

}

class lvBu extends Generals {
    @Override
    public int getMaxHp() {
        return 4;
    }
    @Override
    public int getGender() {
        return 0;
    }

}

class diaoChan extends Generals {
    @Override
    public int getMaxHp() {
        return 3;
    }
    @Override
    public int getGender() {
        return 1;
    }

}