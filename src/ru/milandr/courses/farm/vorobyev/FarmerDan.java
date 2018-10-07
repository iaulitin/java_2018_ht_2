package ru.milandr.courses.farm.vorobyev;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.GenericFarmer;
import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.vorobyev.good.BasicGood;
import ru.milandr.courses.farm.vorobyev.good.Milk;
import ru.milandr.courses.farm.vorobyev.good.Cheese;
import ru.milandr.courses.farm.vorobyev.good.Egg;

public class FarmerDan implements GenericFarmer {
    private boolean isAngry = false;


    public boolean isAngry() {
        return isAngry;
    }

    public void setAngry(boolean angry) {
        isAngry = angry;
    }

    public void farmerMood() {
        if(isAngry)
            System.out.println("I'm so angry!!! AAA!!!");
        else
            System.out.println("I'm fine, thanks");
    }
    @Override
    public void collectGoods(Good good) {
        if (!(good instanceof BasicGood)) {
            System.out.println("Error! Not a good");
            return;
        }
        System.out.printf("%s is collected\n", good);
    }

    @Override
    public void petAnAnimal(Animal animal) {
        System.out.printf("- Hello, %s\n- ", animal);
        animal.produceSound();
    }

    private String tastesRotten(BasicGood basicGood) {
        if (basicGood.isRotten()) {
            this.isAngry = true;
            return "is digusting!";
        } else {
            this.isAngry = false;
            return "tastes good";
        }
    }

    private void kindOfGood(BasicGood basicGood) {
        if (basicGood instanceof Milk)
            System.out.printf("Milk %s\n", tastesRotten(basicGood));

        else if (basicGood instanceof Cheese)
            System.out.printf("Cheese %s\n", tastesRotten(basicGood));

        else if (basicGood instanceof Egg)
            System.out.printf("Egg %s\n", tastesRotten(basicGood));

        else
            System.out.println("Error! Not a basic good");
    }

    @Override
    public void eatProduct(Good good) {
        try {                               //Thread.sleep makes him eat a little bit after you use the method, so some goods can expire
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (!(good instanceof BasicGood)) {
            System.out.println("Error! Not a good");
            return;
        }
        BasicGood basicGood = (BasicGood) good;
        if (basicGood.isEmpty()) {
            System.out.println("I've already eaten this good :(");
            return;
        }
        kindOfGood(basicGood);
        basicGood.setEmpty(true);
    }
}
