package ru.milandr.courses.farm.perepelitsyn;

public class Cow extends Animal implements Animals {
    @Override
    public String toString() {
        return "Cow";
    }

    @Override
    public void produceSound() {
        System.out.println("MUUUUU");
    }

    @Override
    public Good produceGoods() {
        return new Milk();
    }
}
