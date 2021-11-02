package ru.milandr.courses.farm.tkhorzhevskiy.animals;

import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.tkhorzhevskiy.goods.Egg;

public class Chicken extends ParentAnimal {
    private static final String CHICKEN_NAME = "Курица";

    public Chicken() {
        name = CHICKEN_NAME;
    }

    @Override
    public void produceSound() {
        System.out.println("За орду!");
    }

    @Override
    public Good produceGoods() {
        return new Egg();
    }

}
