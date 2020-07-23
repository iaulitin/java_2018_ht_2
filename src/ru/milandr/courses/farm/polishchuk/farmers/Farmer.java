package ru.milandr.courses.farm.polishchuk.farmers;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.GenericFarmer;
import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.polishchuk.goods.*;
import ru.milandr.courses.farm.polishchuk.animals.*;

public class Farmer implements GenericFarmer {
    private final String ATE_ROTTEN_PHRASE = "Ugh, %s, is rotten";
    private final String ATE_GOOD_PHRASE = "Nice %s";
    private final String NULL_GOOD_FOUND = "Null good for eat given";
    private final String FOUND_FOOD_EATEN = "I already ate this \"%s\" food";
    private final String UNDEFINED_GOOD = "I prefer not to eat strange objects";
    private final String NOT_HUNGRY_PHRASE = "I'm not hungry, why are you feeding me?";

    private String name;
    private boolean hungry = true;

    public Farmer() {
        this.name = "Unnamed";
    }

    public Farmer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void timeToEat() {
        hungry = true;
    }

    @Override
    public void collectGoods(Good good) {
        if (good == null) {
            System.err.println(NULL_GOOD_FOUND);
            return;
        }
        System.out.print("Collected: ");
        if (good instanceof Milk) {
            System.out.format("%.2f Liters of milk\n", ((Milk) good).getVolume());
        } else if (good instanceof Egg) {
            System.out.format("%s egg\n", ((Egg) good).getColor());
        } else if (good instanceof Meat) {
            System.out.format("%.2f Kilos of meat from %s\n", ((Meat) good).getWeight(), ((Meat) good).getProducer());
        } else {
            System.err.println("undefined good");
        }
    }

    @Override
    public void petAnAnimal(Animal animal) {
        System.out.println("Hello, " + animal.getClass().getName());
        animal.produceSound();
    }

    @Override
    public void eatProduct(Good good) {
        if (good == null) {
            System.err.println(NULL_GOOD_FOUND);
            return;
        }

        if (!(good instanceof ExtendedGood)) {
            System.err.println(UNDEFINED_GOOD);
            return;
        }

        if (!hungry) {
            System.out.println(NOT_HUNGRY_PHRASE);
            return;
        }

        ExtendedGood extendedGood = (ExtendedGood) good;

        if (!extendedGood.isEaten()) {
            if (extendedGood.isRotten()) {
                System.out.format(ATE_ROTTEN_PHRASE + '\n', extendedGood.getRottenName());
            } else {
                System.out.format(ATE_GOOD_PHRASE + '\n', extendedGood.getGoodName());
            }
            extendedGood.eat();
        } else {
            System.err.format(FOUND_FOOD_EATEN + '\n', extendedGood.getGoodName());
        }
        hungry = false;
    }
}
