package ru.milandr.courses.farm.tkhorzhevskiy.animals;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.tkhorzhevskiy.goods.Egg;

public class Chicken implements Animal {
    @Override
    public void produceSound() {
     System.out.println("За орду!");
    }

    @Override
    public Good produceGoods() {
        return new Egg();
    }
    @Override
    public String toString() {
        return "Курица";
    }
}
