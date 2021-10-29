package ru.milandr.courses.farm.frolov.animals;

import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.frolov.goods.Cheese;

public class Goat extends SuperAnimal {

    public Goat(String name) {
        super(name);
    }

    @Override
    public void produceSound() {
        System.out.println("бе-бе");
    }

    @Override
    public Good produceGoods() {
        return new Cheese();
    }

    @Override
    public String toString() {
        return "Коза " + name;
    }
}
