package ru.milandr.courses.farm.Marshinin.Animals;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.Marshinin.Goods.Milk;

public class Cow implements Animal {

    public void butt() {
        System.out.println("The cow is angry. It butts.");
    }

    @Override
    public void produceSound() {
        System.out.println("Mooooo");
    }

    @Override
    public Good produceGoods() {
        return new Milk();
    }

    @Override
    public String toString() {
        return "Chicken";
    }
}