package ru.milandr.courses.farm.bondarev.Animals;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.bondarev.Goods.Egg;

public class Chicken {

    @Override
    public void produceSound() {
        System.out.println("Pock-Pock");
    }

    @Override
    public Good produceGoods() {
        return new Egg();
    }

}
