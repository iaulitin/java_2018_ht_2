package ru.milandr.courses.farm.koliev.Livestocks;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.koliev.Goods.Milk;

public class Cow implements Animal {
    @Override
    public void produceSound() {
        System.out.println("moo-moo");
    }

    @Override
    public Good produceGoods() {
        return new Milk();
    }
}
