package ru.milandr.courses.farm.koliev.Goods;


public class Milk extends NaturalGood {

    public Milk() {
        setShelfLife(10000);
        setFresh(true);
    }

    @Override
    public String toString() {
        return "Milk";
    }
}
