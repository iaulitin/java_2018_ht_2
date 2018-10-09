package ru.milandr.courses.farm.sitnikov;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.GenericFarmer;
import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.sitnikov.goods.Egg;
import ru.milandr.courses.farm.sitnikov.goods.Milk;
import ru.milandr.courses.farm.sitnikov.goods.SimpleGood;
import ru.milandr.courses.farm.sitnikov.goods.Wool;

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
        if (good instanceof Milk) {
            System.out.println("I'm eatimg milk");
        } else if (good instanceof Wool) {
            System.out.println("So good wool! I can make new clothes)");
        } else if (good instanceof Egg) {
            System.out.println("Lets make an omlet!");
        }
    }
}
