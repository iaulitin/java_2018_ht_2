package ru.milandr.courses.farm.alfyorova.farmer;

import ru.milandr.courses.farm.alfyorova.animal.Animal;
import ru.milandr.courses.farm.alfyorova.animal.Chicken;
import ru.milandr.courses.farm.alfyorova.animal.Cow;
import ru.milandr.courses.farm.alfyorova.animal.Sheep;
import ru.milandr.courses.farm.alfyorova.goods.Good;

public class AngryFarmer extends GenericFarmer {
    private boolean heAngry = true;

    public boolean isHeAngry() {
        return heAngry;
    }

    public void petAnAnimal(Animal animal) {
        if (animal instanceof Sheep) {
            System.out.println("I hate you, sheep");
        } else if (animal instanceof Cow) {
            System.out.println("I hate you, cow");
        } else if (animal instanceof Chicken) {
            System.out.println("I hate you, chicks");
        }
        animal.produceSound();
    }

    public void collectGoods(Good good) {
        good.goRotten();
        System.out.println("f*cking good's collected : " + good);
    }

    public void spoilGood(Good good) {
        good.setTimeOfBeingFresh(0);
        good.setItFresh(false);
        System.out.println("I Hate " + good);
    }
}
