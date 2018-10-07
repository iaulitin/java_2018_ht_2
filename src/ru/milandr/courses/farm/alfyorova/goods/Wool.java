package ru.milandr.courses.farm.alfyorova.goods;

public class Wool extends Good {
    public Wool() {
        setGoodName("wool");
        setItFresh(true);
        setTimeOfBeingFresh(1000);
    }

    @Override
    public String toString() {
        return this.getGoodName();
    }
}
