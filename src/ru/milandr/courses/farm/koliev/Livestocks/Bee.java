package ru.milandr.courses.farm.koliev.Livestocks;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.koliev.Goods.Honey;

public class Bee implements Animal {
    @Override
    public void produceSound() {
        System.out.println("z-z-z");
    }

    @Override
    public Good produceGoods() {
        return new Honey();
    }
}
