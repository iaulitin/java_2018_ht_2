package ru.milandr.courses.farm.khaidukov

public class Milk extends Goods {
    private static long rottenTime = 200;

    public Milk ()
    {
        setRottenTime(rottenTime);
    }

    @Override
    public String toString() {
        return "Milk";
    }
}
