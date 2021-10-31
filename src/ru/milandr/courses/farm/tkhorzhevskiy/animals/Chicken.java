package ru.milandr.courses.farm.tkhorzhevskiy.animals;

import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.tkhorzhevskiy.goods.Egg;

public class Chicken extends ParentAnimal {
    private static final String ChickenName = "Курица";

    public Chicken() {
        name=ChickenName;
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
