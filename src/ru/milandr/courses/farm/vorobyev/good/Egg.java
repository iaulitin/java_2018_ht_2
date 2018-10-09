package ru.milandr.courses.farm.vorobyev.good;


public class Egg extends BasicGood {
    public Egg() {
        this.expireTime = 100;
    }

    @Override
    public String toString() {
        return "Egg";
    }
}
