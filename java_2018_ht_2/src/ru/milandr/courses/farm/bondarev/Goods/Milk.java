package ru.milandr.courses.farm.bondarev.Goods;

public class Milk extends JustGood {

    public Milk() {
        setBestBefore(6000);
        setFresh(true);
    }

    @Override
    public String toString() {
        return "Milk";
    }
}