package ru.milandr.courses.farm.rasskazov;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.GenericFarmer;
import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.rasskazov.goods.Info;

public class Farmer implements GenericFarmer {
    public void collectGoods(Good good) {
        System.out.println(good);
    }

    @Override
    public void petAnAnimal(Animal animal) {
        animal.produceSound();
    }

    @Override
    public void eatProduct(Good good) {
        if (Info.freshness) {
            System.out.println("It is tasty!");
        }
        else{
            System.out.println("It's not tasty!");
        }
    }
}
