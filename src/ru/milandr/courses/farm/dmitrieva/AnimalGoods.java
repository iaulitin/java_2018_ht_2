package ru.milandr.courses.farm.dmitrieva;


import ru.milandr.courses.farm.Good;

public class AnimalGoods implements Good {
    protected boolean isRotten;
    public long timeStart;
    public static long rottenTime;

    public static void setRottenTime(long rottenTime) {
        AnimalGoods.rottenTime = rottenTime;
    }

    public AnimalGoods() {
        goRotten();
    }

    public boolean isRotten() {
        long timeNow = System.currentTimeMillis();
        long currentTime = timeNow - timeStart;
        if (currentTime >= rottenTime) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void goRotten() {
        timeStart = System.currentTimeMillis();
    }
}
