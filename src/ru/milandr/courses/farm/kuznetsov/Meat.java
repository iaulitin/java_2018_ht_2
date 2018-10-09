package ru.milandr.courses.farm.kuznetsov;

public class Meat extends GoodFromFarm {
    public Meat() {
        this.setTimeBeingFresh(3000);
    }

    public String toString() {
        return "meat";
    }
}
