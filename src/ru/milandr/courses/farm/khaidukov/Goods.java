package ru.milandr.courses.farm.khaidukov

import java.util.Date;

public class Goods implements Good {
    private boolean isRotten = false;
    private long createTime;
    private long rottenTime;

    public void setRottenTime(long rottenTime) {
        this.rottenTime = rottenTime;
    }

    public Goods ()
    {
        goRotten();
    }

    public boolean isRotten() {
        Date date = new Date();
        long curTime = date.getTime();

        if (curTime >= createTime + rottenTime)
            this.isRotten = true;

        return isRotten;
    }

    @Override
    public void goRotten() {
        Date date = new Date();
        createTime = date.getTime();
    }
}
