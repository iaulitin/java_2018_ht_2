package ru.milandr.courses.farm.Marshinin.Animals;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.Marshinin.Goods.Eggs;

public class Chicken implements Animal {

    public static void killWorm() {
        System.out.println("The worm is killed");
    }

    @Override
    public void produceSound() {
        System.out.println("Ko ko ko");
    }

    @Override
    public Good produceGoods() {
        return new Eggs();
    }

    @Override
    public String toString() {
        return "Chicken";
    }
}
