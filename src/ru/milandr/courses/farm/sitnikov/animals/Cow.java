package ru.milandr.courses.farm.sitnikov.animals;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.sitnikov.goods.Milk;

public class Cow implements Animal {
    @Override
    public void produceSound() {
        System.out.println("mooo");
    }

    @Override
    public Good produceGoods() {
        return new Milk();
    }

    @Override
    public String toString() {
        return "cow";
    }
}
