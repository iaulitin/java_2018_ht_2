package ru.milandr.courses.farm.ozherelev;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;

public class Bee implements Animal {

    @Override
    public void produceSound() {
        System.out.println("bzzzzz");
    }

    @Override
    public Good produceGoods() {
        return new Honey();
    }
}
