package ru.milandr.courses.farm.khaidukov

public class Sheep implements Animal {
    @Override
    public String toString() {
        return "Sheep";
    }

    @Override
    public void produceSound() {
        System.out.println ("Beeeeeeeeeeeeeeee!\n");
    }

    @Override
    public Good produceGoods() {
        return new Wool();
    }
}
