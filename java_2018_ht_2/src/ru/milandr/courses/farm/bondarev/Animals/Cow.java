package ru.milandr.courses.farm.bondarev.Animals;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.bondarev.Goods.Milk;

public class Cow {

    @Override
    public void produceSound() {
        System.out.println("Moo-oo");
    }

    @Override
    public Good produceGoods() {
        return new Milk();
    }

}
