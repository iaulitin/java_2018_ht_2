package ru.milandr.courses.farm.sitnikov;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.GenericFarmer;
import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.sitnikov.goods.SimpleGood;

import java.util.ArrayList;
import java.util.List;

public class Farmer implements GenericFarmer {
    List<Good> collectedGoods = new ArrayList<>();
    private boolean isAngry = false;

    public List<Good> getCollectedGoods() {
        return collectedGoods;
    }

    public void setCollectedGoods(List<Good> collectedGoods) {
        this.collectedGoods = collectedGoods;
    }

    public boolean isAngry() {
        return isAngry;
    }

    public void setAngry(boolean angry) {
        isAngry = angry;
    }

    @Override
    public void collectGoods(Good good) {
        this.collectedGoods.add(good);
    }

    @Override
    public void petAnAnimal(Animal animal) {
        System.out.println(String.format("Hello %s", animal));
        animal.produceSound();
    }

    @Override
    public void eatProduct(Good good) {
        SimpleGood mygood = (SimpleGood) good;
        if (mygood.isRotten()) {
            this.isAngry = true;
            System.out.println("What's the shit!");
            return;
        }
        this.isAngry = false;
        System.out.println(String.format("I've eaten %s! Nice!", good));
    }
}
