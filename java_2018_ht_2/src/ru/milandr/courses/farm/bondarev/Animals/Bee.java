package ru.milandr.courses.farm.bondarev.Animals;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.bondarev.Goods.Honey;

public class Bee {

    @Override
    public void produceSound() {
        System.out.println("bz-zz-zz");
    }

    @Override
    public Good produceGoods() {
        return new Honey();
    }

}
