package ru.milandr.courses.farm.kuznetsov;

public class Egg extends GoodFromFarm {
    public Egg() {
        this.setTimeBeingFresh(6000);
    }

    @Override
    public String toString() {
        return "egg";
    }
}
