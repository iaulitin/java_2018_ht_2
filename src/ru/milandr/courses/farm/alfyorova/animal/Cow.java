package ru.milandr.courses.farm.alfyorova.animal;

import ru.milandr.courses.farm.alfyorova.animal.Animal;
import ru.milandr.courses.farm.alfyorova.goods.Good;
import ru.milandr.courses.farm.alfyorova.goods.Milk;

public class Cow extends Animal {
    public void produceSound() {
        System.out.println("Muu");
    }
    public Good produceGoods() {
        return new Milk();
    }
}
