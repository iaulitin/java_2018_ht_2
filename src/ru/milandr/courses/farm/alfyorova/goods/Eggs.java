package ru.milandr.courses.farm.alfyorova.goods;

public class Eggs extends Good {
    public Eggs() {
        setItFresh(true);
        setTimeOfBeingFresh(30); //days
    }

    @Override
    public String toString() {
        return "Eggs";
    }
}
