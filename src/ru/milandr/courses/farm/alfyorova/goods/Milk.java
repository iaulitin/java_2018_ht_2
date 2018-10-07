package ru.milandr.courses.farm.alfyorova.goods;

public class Milk extends Good {
    public Milk() {
        setGoodName("Milk");
        setItFresh(true);
        setTimeOfBeingFresh(3);
    }

    @Override
    public String toString() {
        return this.getGoodName();
    }
}
