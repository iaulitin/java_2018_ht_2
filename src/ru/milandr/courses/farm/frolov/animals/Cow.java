package ru.milandr.courses.farm.frolov.animals;

import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.frolov.goods.Milk;

public class Cow extends SuperAnimal {

    public Cow(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Корова " + getName();
    }

    @Override
    public void produceSound() {
        System.out.println("му-му");
    }

    @Override
    public Good produceGoods() {
        return new Milk(this);
    }

}
