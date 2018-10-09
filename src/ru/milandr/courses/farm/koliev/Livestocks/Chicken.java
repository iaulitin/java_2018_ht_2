package ru.milandr.courses.farm.koliev.Livestocks;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.koliev.Goods.Egg;

public class Chicken implements Animal {
    @Override
    public void produceSound() {
        System.out.println("cheep-cheep");
    }

    @Override
    public Good produceGoods() {
        return new Egg();
    }
}
