package ru.milandr.courses.farm.vorobyev.good;

public class Milk extends BasicGood {
    public Milk() {
        this.expireTime = 20;
    }

    @Override
    public String toString() {
        return "Milk";
    }
}
