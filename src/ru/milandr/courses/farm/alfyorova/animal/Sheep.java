package ru.milandr.courses.farm.alfyorova.animal;

import ru.milandr.courses.farm.alfyorova.goods.Good;
import ru.milandr.courses.farm.alfyorova.goods.Wool;

public class Sheep extends Animal {
    public void jump() {
        System.out.println("sheep is jumping");
    }

    public void produceSound() {
        System.out.println("mee");
    }

    public Good produceGoods() {
        return new Wool();
    }
}
