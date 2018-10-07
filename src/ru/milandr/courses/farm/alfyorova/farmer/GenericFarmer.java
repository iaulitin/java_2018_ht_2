package ru.milandr.courses.farm.alfyorova.farmer;

import ru.milandr.courses.farm.alfyorova.GenericFarmerInterface;
import ru.milandr.courses.farm.alfyorova.animal.Animal;
import ru.milandr.courses.farm.alfyorova.goods.Good;

public class GenericFarmer implements GenericFarmerInterface {
    public void collectGoods(Good good) {
        good.goRotten();
        System.out.println(good.getGoodName());
    }

    public void petAnAnimal(Animal animal) {
        animal.produceSound();
    }

    public void eatProduct(Good good) {
        good.eatGood();
    }
}
