package ru.milandr.courses.farm.Beliavskiy;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.GenericFarmer;
import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.Beliavskiy.Goods.Milk;
import ru.milandr.courses.farm.Beliavskiy.Goods.Eggs;
import ru.milandr.courses.farm.Beliavskiy.Goods.GoodBehavior;
import ru.milandr.courses.farm.Beliavskiy.Goods.Dead_Mouses;
import java.util.ArrayList;
import java.util.List;

public class Farmer implements GenericFarmer {

    List<Good> collectedGoods = new ArrayList<>();
    private boolean inMadness = false;

    public List<Good> getCollectedGoods() {
        return collectedGoods;
    }

    public void setCollectedGoods(List<Good> collectedGoods) {
        this.collectedGoods = collectedGoods;
    }

    public boolean InMadness() {
        return inMadness;
    }

    public void setMadness(boolean madness) {
        inMadness = madness;
    }

    @Override
    public void collectGoods(Good good) {
        this.collectedGoods.add(good);
    }

    @Override
    public void petAnAnimal(Animal animal) {
        System.out.println(String.format("Hello, %s", animal));
        animal.produceSound();
    }

    @Override
    public void eatProduct(Good good) {
        GoodBehavior meal = (GoodBehavior) good;
        if (meal.Rotten()) {
            this.inMadness = true;
            System.out.println("Next time i should check what i eat!!!");
            return;
        }
        this.inMadness = false;
        if (good instanceof Milk) {
            System.out.println("If i will drink, i'll stay healthy!");
        } else if (good instanceof Eggs) {
            System.out.println("Eggs are the best sourse of protein!");
        } else if (good instanceof Dead_Mouses) {
            System.out.println("I have no idea why i should eat this...");
        }


    }
}
