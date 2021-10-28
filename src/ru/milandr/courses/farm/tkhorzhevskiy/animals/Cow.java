package ru.milandr.courses.farm.tkhorzhevskiy.animals;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.tkhorzhevskiy.goods.Milk;

public class Cow implements Animal {

    @Override
    public void produceSound() {
    System.out.println("Lets get mooooving");
    }

    @Override
    public Good produceGoods() {
        return new Milk();
    }
    @Override
    public String toString() {
        return "Корова";
    }
}
