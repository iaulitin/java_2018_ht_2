package ru.milandr.courses.farm.perepelitsyn;

public class Sheep extends Animal implements Animals {
    @Override
    public String toString() {
        return "Sheep";
    }

    @Override
    public void produceSound() {
        System.out.println("BAAAAH");
    }

    @Override
    public Good produceGoods() {
        return new Wool();
    }
}
