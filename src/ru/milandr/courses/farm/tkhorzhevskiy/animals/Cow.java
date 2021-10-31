package ru.milandr.courses.farm.tkhorzhevskiy.animals;

import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.tkhorzhevskiy.goods.Milk;

public class Cow extends ParentAnimal {
    private static final String CowName = "Корова";

    public Cow() {
        name=CowName;
    }

    @Override
    public void produceSound() {
    System.out.println("Lets get mooooving");
    }
    @Override
    public Good produceGoods() {
        return new Milk();
    }

}
