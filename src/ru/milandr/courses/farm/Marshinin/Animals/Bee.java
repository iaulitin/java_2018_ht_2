package ru.milandr.courses.farm.Marshinin.Animals;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.Marshinin.Goods.Honey;

public class Bee implements Animal {

    public void pollinateTheFlower() {
        System.out.println("The Flower is pollinated");
    }

    @Override
    public void produceSound() {
        System.out.println("bzzzz");
    }

    @Override
    public Good produceGoods() {
        return new Honey();
    }

    @Override
    public String toString() {
        return "Bee";
    }
}
