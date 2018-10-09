package ru.milandr.courses.farm.ozherelev;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;

public class Cow implements Animal {
    @Override
    public void produceSound() {
        System.out.println("muuu");
    }

    @Override
    public Good produceGoods() {
        return new Milk();
    }
}
