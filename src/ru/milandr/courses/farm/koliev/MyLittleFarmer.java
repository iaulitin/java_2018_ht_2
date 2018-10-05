package ru.milandr.courses.farm.koliev;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.GenericFarmer;
import ru.milandr.courses.farm.Good;


public class MyLittleFarmer implements GenericFarmer {


    @Override
    public void collectGoods(Good good) {
        good.goRotten();
        System.out.println(good);
    }

    @Override
    public void petAnAnimal(Animal animal) {
        animal.produceSound();
    }

    @Override
    public void eatProduct(Good good) {


    }
}
