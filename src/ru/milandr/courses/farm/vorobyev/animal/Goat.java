package ru.milandr.courses.farm.vorobyev.animal;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.vorobyev.good.Cheese;

public class Goat implements Animal {
    public void showTongue() {
        System.out.println(":p");
    }

    @Override
    public void produceSound() {
        System.out.println("Bleat");
    }

    @Override
    public Good produceGoods() {
        return new Cheese();
    }

    @Override
    public String toString() {
        return "Goat";
    }
}
