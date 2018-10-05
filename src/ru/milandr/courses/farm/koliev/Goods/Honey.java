package ru.milandr.courses.farm.koliev.Goods;


public class Honey extends NaturalGood {

    public Honey() {
        setShelfLife(1000000);
        setFresh(true);
    }

    @Override
    public String toString() {
        return "Honey!";
    }
}
