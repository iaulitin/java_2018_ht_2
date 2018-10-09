package ru.milandr.courses.farm.koliev.Goods;


public class Egg extends NaturalGood {

    public Egg() {
        setShelfLife(18000);
        setFresh(true);
    }

    @Override
    public String toString() {
        return "Egg";
    }
}
