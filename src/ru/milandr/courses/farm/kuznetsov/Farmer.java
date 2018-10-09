package ru.milandr.courses.farm.kuznetsov;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.GenericFarmer;
import ru.milandr.courses.farm.kuznetsov.GoodFromFarm;

public class Farmer implements GenericFarmer {
    private String name;
    private int age;
    private String reagion;
    private boolean isBearded;

    public Farmer(String name, int age, String reagion, boolean isBearded) {
        this.name = name;
        this.age = age;
        this.reagion = reagion;
        this.isBearded = isBearded;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getReagion() {
        return reagion;
    }

    public void setReagion(String reagion) {
        this.reagion = reagion;
    }

    public boolean isBearded() {
        return isBearded;
    }

    public void setBearded(boolean bearded) {
        isBearded = bearded;
    }

    @Override
    public void collectGoods(Good good) {
        good.goRotten();
        System.out.printf("Farmer: I've just collected %s.\n", good);
    }

    @Override
    public void petAnAnimal(Animal animal) {
        animal.produceSound();
    }

    @Override
    public void eatProduct(Good good) {
        GoodFromFarm food = (GoodFromFarm) good;
        if (food.isRotten())
            System.out.printf("Farmer: Foo! I won't eat %s! It has become rotten.\n", food);
        else
            System.out.printf("Farmer: Yammy! Such a tasty %s!\n", food);
    }
}
