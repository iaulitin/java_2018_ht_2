package ru.milandr.courses.farm.ozherelev;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;


public class Chicken implements Animal {

    @Override
    public void produceSound() {
        System.out.println("koko");
    }

    @Override
    public Good produceGoods() {
        return new Egg();
    }
}
