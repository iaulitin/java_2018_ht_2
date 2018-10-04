package ru.milandr.courses.farm.sitnikov.animals;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.sitnikov.goods.Egg;

public class Chicken implements Animal {
    @Override
    public void produceSound() {
        System.out.println("chick");
    }

    @Override
    public Good produceGoods() {
        return new Egg();
    }

    @Override
    public String toString() {
        return "chicken";
    }
}
