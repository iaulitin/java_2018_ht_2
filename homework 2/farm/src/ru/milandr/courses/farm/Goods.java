package ru.milandr.courses.farm;

import java.util.Date;

public class Goods implements  Good {
    protected boolean isRotten;
    protected long createTime;
    protected static long rottenTime;

    public void setRottenTime(long rottenTime) {
        this.rottenTime = rottenTime;
    }
    public Goods(){
        goRotten();
    }
    public boolean isRotten() {
        Date data = new Date();
        long currentTime = data.getTime();
        if (currentTime >= createTime + rottenTime) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public void goRotten() {
        Date data = new Date();
        createTime = data.getTime();
    }

    }

