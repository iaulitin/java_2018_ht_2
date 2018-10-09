package ru.milandr.courses.farm.vorobyev.animal;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.vorobyev.good.Egg;

public class Hen implements Animal {

    public void goCrazy() {
        System.out.println("Pok pok pok!!!!");
    }

    @Override
    public void produceSound() {
        System.out.println("Cluck");
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
