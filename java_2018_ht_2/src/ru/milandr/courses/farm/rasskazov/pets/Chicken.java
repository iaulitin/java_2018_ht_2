package ru.milandr.courses.farm.rasskazov.pets;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.rasskazov.goods.Egg;

public class Chicken implements Animal {
    @Override
    public void produceSound() {
        System.out.println("Cluck-cluck-cluck");
    }
    @Override
    public Good produceGoods() {
        return new Egg();
    }
}
