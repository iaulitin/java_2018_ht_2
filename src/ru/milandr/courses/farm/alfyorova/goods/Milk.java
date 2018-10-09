package ru.milandr.courses.farm.alfyorova.goods;

public class Milk extends Good {
    public Milk() {
        setItFresh(true);
        setTimeOfBeingFresh(3); //days
    }

    @Override
    public String toString() {
        return "Milk";
    }
}
