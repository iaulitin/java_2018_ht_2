package ru.milandr.courses.farm.alfyorova.farmer;

import ru.milandr.courses.farm.alfyorova.GenericFarmerInterface;
import ru.milandr.courses.farm.alfyorova.animal.Animal;
import ru.milandr.courses.farm.alfyorova.animal.Chicken;
import ru.milandr.courses.farm.alfyorova.animal.Cow;
import ru.milandr.courses.farm.alfyorova.animal.Sheep;
import ru.milandr.courses.farm.alfyorova.goods.Good;

public class GenericFarmer implements GenericFarmerInterface {
    public void collectGoods(Good good) {
        good.goRotten();
        System.out.println("good's collected : " + good);
    }

    public void petAnAnimal(Animal animal) {
        if (animal instanceof Sheep) {
            System.out.println("I love you, sheep");
        } else if (animal instanceof Cow) {
            System.out.println("I love you, cow");
        } else if (animal instanceof Chicken) {
            System.out.println("I love you, chicks");
        }
        animal.produceSound();
    }

    public void eatProduct(Good good) {
        good.eatGood();
    }
}
