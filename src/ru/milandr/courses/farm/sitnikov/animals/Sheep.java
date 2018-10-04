package ru.milandr.courses.farm.sitnikov.animals;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.sitnikov.goods.Wool;

public class Sheep implements Animal {
    @Override
    public void produceSound() {
        System.out.println("beee");
    }

    @Override
    public Good produceGoods() {
        return new Wool();
    }

    @Override
    public String toString() {
        return "sheep";
    }
}
