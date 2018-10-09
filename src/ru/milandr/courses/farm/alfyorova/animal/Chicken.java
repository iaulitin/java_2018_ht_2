package ru.milandr.courses.farm.alfyorova.animal;

import ru.milandr.courses.farm.alfyorova.goods.Eggs;
import ru.milandr.courses.farm.alfyorova.goods.Good;


public class Chicken extends Animal {
    public void produceSound() {
        System.out.println("cluck-cluck");
    }
    public Good produceGoods() {
        return new Eggs();
    }
}
