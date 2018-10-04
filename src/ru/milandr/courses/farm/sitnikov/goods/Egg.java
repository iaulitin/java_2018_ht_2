package ru.milandr.courses.farm.sitnikov.goods;

public class Egg extends SimpleGood {
    public Egg() {
        super();
        setRottenTime(6);
    }

    @Override
    public String toString() {
        return "яйцо";
    }
}
