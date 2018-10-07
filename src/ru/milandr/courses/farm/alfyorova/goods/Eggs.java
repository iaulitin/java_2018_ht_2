package ru.milandr.courses.farm.alfyorova.goods;

public class Eggs extends Good {
    public Eggs() {
        setGoodName("Egg");
        setItFresh(true);
        setTimeOfBeingFresh(10);
    }

    @Override
    public String toString() {
        return this.getGoodName();
    }
}
