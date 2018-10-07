package ru.milandr.courses.farm.Marshinin;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.GenericFarmer;
import ru.milandr.courses.farm.Good;

import ru.milandr.courses.farm.Marshinin.Goods.PropertiesOfGoods;
import ru.milandr.courses.farm.Marshinin.Goods.Milk;
import ru.milandr.courses.farm.Marshinin.Goods.Eggs;
import ru.milandr.courses.farm.Marshinin.Goods.Honey;

public class Farmer implements GenericFarmer {
    private boolean isAngry = false;

    public boolean isAngry() {
        return isAngry;
    }

    public void setAngry(boolean angry) {
        isAngry = angry;
    }

    public void farmerMood() {
        if (isAngry)
            System.out.println("The farmer is angry");
        else
            System.out.println("I am really happy");
    }

    @Override
    public void collectGoods(Good good) {
        if (!(good instanceof PropertiesOfGoods)) {
            System.out.println("It is strange.");
            return;
        }
        System.out.printf("%s is collected.\n", good);
    }

    @Override
    public void petAnAnimal(Animal animal) {
        System.out.printf("- Hello, %s\n- ", animal);
        animal.produceSound();
    }

    private String tastesRotten(PropertiesOfGoods basicGood) {
        if (basicGood.isRotten()) {
            this.isAngry = true;
            return "It is terrible";
        } else {
            this.isAngry = false;
            return "It is wonderful";
        }
    }

    private void kindOfGood(PropertiesOfGoods basicGood) {
        if (basicGood instanceof Milk)
            System.out.printf("Milk %s\n", tastesRotten(basicGood));
        else if (basicGood instanceof Honey)
            System.out.printf("Cheese %s\n", tastesRotten(basicGood));
        else if (basicGood instanceof Eggs)
            System.out.printf("Egg %s\n", tastesRotten(basicGood));
        else
            System.out.println("Error! Not a basic good");
    }

    @Override
    public void eatProduct(Good good) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (!(good instanceof PropertiesOfGoods)) {
            System.out.println("Error! Not a good");
            return;
        }
        PropertiesOfGoods basicGood = (PropertiesOfGoods) good;
    }
}
