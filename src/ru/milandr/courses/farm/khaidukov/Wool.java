package ru.milandr.courses.farm.khaidukov;

public class Wool extends Goods {
    private static long rottenTime = 100;

    public Wool ()
    {
        setRottenTime(rottenTime);
    }

    @Override
    public String toString() {
        return "Wool";
    }
}
