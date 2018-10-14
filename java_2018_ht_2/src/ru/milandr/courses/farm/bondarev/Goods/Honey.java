package ru.milandr.courses.farm.bondarev.Goods;

public class Honey extends JustGood {

    public Honey() {
        setBestBefore(666000);
        setFresh(true);
    }

    @Override
    public String toString() {
        return "Honey";
    }
}