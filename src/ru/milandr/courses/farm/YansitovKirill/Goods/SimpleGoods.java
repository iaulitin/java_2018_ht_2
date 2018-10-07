package ru.milandr.courses.farm.YansitovKirill.Goods;
import ru.milandr.courses.farm.Good;

import java.util.Date;

public class SimpleGoods implements Good{
    private long timeOfCreation;

    private static long rottenTime;  //milliseconds

    protected static void setRottenTime(long rottenTime) {
        SimpleGoods.rottenTime = rottenTime;
    }

    public void SimpleGoods() {
        goRotten();
    }

    public boolean isRotten() {
        Date data = new Date();
        long currentTime = data.getTime();

        if (currentTime >= timeOfCreation + rottenTime) {
            return true;
        }
        else {
            return false;
        }

    }

    @Override
    public void goRotten() {
        Date data = new Date();
        timeOfCreation = data.getTime();
    }
}
