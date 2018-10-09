package ru.milandr.courses.farm.ozherelev;

import java.util.ArrayList;

import ru.milandr.courses.farm.GenericFarmer;
import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.Animal;

public class Farmer implements GenericFarmer {
    private boolean moodBad;
    private ArrayList<Good> collectedGoods = new ArrayList<Good>();

    public void setCollectedGoods(ArrayList<Good> collectedGoods) {
        this.collectedGoods = collectedGoods;
    }

    public ArrayList<Good> getCollectedGoods()
    {
        return this.collectedGoods;
    }

    public void setMoodBad(boolean moodBad) {
        this.moodBad = moodBad;
    }

    public boolean getMoodBad() {
        return this.moodBad;
    }

    @Override
    public void collectGoods(Good good) {
        this.collectedGoods.add(good);
        System.out.println(good.toString());
    }

    @Override
    public void petAnAnimal(Animal animal)
    {
        System.out.printf("%s", "Hello " + animal.getClass().getSimpleName() + "\n");
    }

    @Override
    public void eatProduct(Good good) {
        AnimalGoods newGood = (AnimalGoods) good;

        if (newGood.isRotten())
        {
            this.moodBad = true;
            System.out.println("I've eaten a bad meal!");
        }

        else
        {
            this.moodBad = false;
            System.out.println("What's a tasty meal, I would get another one!");
        }
    }
}
