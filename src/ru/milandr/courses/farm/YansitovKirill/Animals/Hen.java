package ru.milandr.courses.farm.YansitovKirill.Animals;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.YansitovKirill.Goods.Egg;

public class Hen implements Animal {
    @Override
    public void produceSound() {
        System.out.println("Cluck-cluck");
    }

    @Override
    public Good produceGoods() {
        return new Egg();
    }

    @Override
    public String toString() {
        return "Hen";
    }
}
