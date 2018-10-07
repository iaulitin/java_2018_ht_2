package ru.milandr.courses.farm.YansitovKirill.Animals;


import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.YansitovKirill.Goods.Honey;

public class Bee implements Animal {
    @Override
    public void produceSound() {
        System.out.println("Bzzzzz");
    }

    @Override
    public Good produceGoods() {
        return new Honey();
    }

    @Override
    public String toString() {
        return "Bee";
    }
}
