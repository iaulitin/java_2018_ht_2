package ru.milandr.courses.farm.sitnikov.goods;

public class Wool extends SimpleGood {
    public Wool() {
        super();
        setRottenTime(10);
    }

    @Override
    public String toString() {
        return "шерсть";
    }
}
