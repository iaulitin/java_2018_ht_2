package ru.milandr.courses.farm.filippova;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.GenericFarmer;
import ru.milandr.courses.farm.Good;

public class Farmer implements GenericFarmer {
    private String name;
    private String country;
    private int age;


    public static void becomingAngry() {
        System.out.print("I am very angry!");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public void collectGoods(Good good) {
        System.out.printf("%s", "*collecting " + good.getClass().getSimpleName() + "*" + "\n");

    }

    @Override
    public void petAnAnimal(Animal animal) {
        animal.produceSound();
        System.out.printf("%s", "Hello, " + animal.getClass().getSimpleName() + "\n");


    }


    @Override
    public void eatProduct(Good good) {
        good.goRotten();

        if (good instanceof Milk && !((Milk) good).isTasted()) {
            if (((Milk) good).isRotten()) {
                becomingAngry();
                System.out.println("Milk is not good((");
            } else {
                System.out.println("This milk is good!We can do a shake!");
            }
        }
        if (good instanceof Eggs && !((Eggs) good).isTasted()) {
            if (((Eggs) good).isRotten()) {
                becomingAngry();
                System.out.println("Eggs are not good(");

            } else {
                System.out.println("Very good eggs, let's cook an omelet");

            }
        }
        if (good instanceof Wool && !((Wool) good).isTasted()) {
            if (((Wool) good).isRotten()) {
                becomingAngry();
                System.out.println("Wool is not good");
            } else {
                System.out.println("Wool is good, now I will have a new coat!");
            }
        }
    }


}
