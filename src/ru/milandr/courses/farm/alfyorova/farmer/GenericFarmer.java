package ru.milandr.courses.farm.alfyorova.farmer;

import ru.milandr.courses.farm.alfyorova.GenericFarmerInterface;
import ru.milandr.courses.farm.alfyorova.animal.Animal;
import ru.milandr.courses.farm.alfyorova.animal.Chicken;
import ru.milandr.courses.farm.alfyorova.animal.Cow;
import ru.milandr.courses.farm.alfyorova.animal.Sheep;
import ru.milandr.courses.farm.alfyorova.goods.Eggs;
import ru.milandr.courses.farm.alfyorova.goods.Good;
import ru.milandr.courses.farm.alfyorova.goods.Milk;
import ru.milandr.courses.farm.alfyorova.goods.Wool;

public class GenericFarmer implements GenericFarmerInterface {
    private boolean heAngry = false;

    public boolean isHeAngry() {
        return heAngry;
    }
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
        if (good.isItFresh()) {
            if (good instanceof Milk) {
                System.out.println("I am drinking milk");
            } else if (good instanceof Wool) {
                System.out.println("I will wear woolen clothes");
            } else if (good instanceof Eggs) {
                System.out.println("I like eggs");
            }
        } else {
            heAngry = true;
        }
    }
}
