package ru.milandr.courses.farm.bondarev.Goods;

public class Egg extends JustGood {

    public Egg() {
        setBestBefore(66000);
        setFresh(true);
    }

    @Override
    public String toString() {
        return "Egg";
    }
}