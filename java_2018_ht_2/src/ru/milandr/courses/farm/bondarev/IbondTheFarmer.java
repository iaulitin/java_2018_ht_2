package ru.milandr.courses.farm.bondarev;

import ru.milandr.courses.farm.bondarev.Goods.JustGood;
import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.GenericFarmer;
import ru.milandr.courses.farm.Good;


public class IbondTheFarmer implements GenericFarmer {

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
        ((JustGood)good).eatGood();
    }
}