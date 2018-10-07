package ru.milandr.courses.farm.rasskazov.pets;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.rasskazov.goods.Milk;

public class Cow implements Animal {
    @Override
    public void produceSound() {
        System.out.println("Moo");
    }
    @Override
    public Good produceGoods() {
        return new Milk();
    }
}
