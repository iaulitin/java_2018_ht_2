package ru.milandr.courses.farm.koliev.Goods;


public class Milk extends NaturalGood {

    public Milk() {
        setFresh(true);
        setShelfLife(10000);
    }

    @Override
    public String toString() {
        return "Milk";
    }
}
