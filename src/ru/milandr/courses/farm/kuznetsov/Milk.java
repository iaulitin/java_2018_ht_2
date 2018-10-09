package ru.milandr.courses.farm.kuznetsov;

public class Milk extends GoodFromFarm {
    public Milk() {
        this.setTimeBeingFresh(5000);
    }

    @Override
    public String toString() {
        return "milk";
    }
}
