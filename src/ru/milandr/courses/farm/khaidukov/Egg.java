package ru.milandr.courses.farm.khaidukov

public class Egg extends Goods{
    private static long rottenTime = 300;

    public Egg ()
    {
        setRottenTime(rottenTime);
    }

    @Override
    public String toString() {
        return "Egg";
    }
}
