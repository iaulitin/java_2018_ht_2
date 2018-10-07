package ru.milandr.courses.farm.vorobyev.good;

public class Cheese extends BasicGood {
    public Cheese() {
        this.expireTime = 5;
    }

    @Override
    public String toString() {
        return "Cheese";
    }
}
