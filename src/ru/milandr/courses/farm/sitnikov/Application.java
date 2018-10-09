package ru.milandr.courses.farm.sitnikov;

import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.sitnikov.animals.Chicken;
import ru.milandr.courses.farm.sitnikov.animals.Cow;
import ru.milandr.courses.farm.sitnikov.animals.Sheep;

public class Application {
    public static void main(String[] args) {
        Farmer farmer = new Farmer();
        Cow cow = new Cow();
        Sheep sheep = new Sheep();
        Chicken chicken = new Chicken();
        System.out.println("created 3 animals: cow, sheep, chicken");
        farmer.petAnAnimal(cow);
        farmer.petAnAnimal(sheep);
        farmer.petAnAnimal(chicken);
        Good milk = cow.produceGoods();
        System.out.println("farmer eats milk");
        farmer.eatProduct(milk);
        Good wool = sheep.produceGoods();
        wool.goRotten();
        System.out.println("farmer eats wool");
        farmer.eatProduct(wool);
        try {
            Thread.sleep(12000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("farmer eats rotten wool");
        farmer.eatProduct(wool);

        Good egg = chicken.produceGoods();
        System.out.println("farmer collects egg");
        farmer.collectGoods(egg);
        egg.goRotten();

    }
}
