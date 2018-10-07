package ru.milandr.courses.farm.alfyorova.animal;

import ru.milandr.courses.farm.alfyorova.AnimalInterface;
import ru.milandr.courses.farm.alfyorova.goods.Good;

public class Animal implements AnimalInterface {
    public void produceSound() {
        System.out.println("I am an animal");
    }

    public Good produceGoods() {
        return new Good();
    }
}
