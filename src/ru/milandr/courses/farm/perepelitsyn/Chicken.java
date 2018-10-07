package ru.milandr.courses.farm.perepelitsyn;

public class Chicken extends Animal implements Animals {
    @Override
    public String toString() {
        return "Chicken";
    }

    @Override
    public void produceSound() {
        System.out.println("pok pok");
    }

    @Override
    public Good produceGoods() {
        return new Eggs();
    }
}