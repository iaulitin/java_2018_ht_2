package ru.milandr.courses.farm.alfyorova;

import ru.milandr.courses.farm.alfyorova.animal.Animal;
import ru.milandr.courses.farm.alfyorova.animal.Cow;
import ru.milandr.courses.farm.alfyorova.animal.Chicken;
import ru.milandr.courses.farm.alfyorova.animal.Sheep;
import ru.milandr.courses.farm.alfyorova.farmer.AngryFarmer;
import ru.milandr.courses.farm.alfyorova.farmer.GenericFarmer;
import ru.milandr.courses.farm.alfyorova.goods.Eggs;
import ru.milandr.courses.farm.alfyorova.goods.Good;
import ru.milandr.courses.farm.alfyorova.goods.Milk;
import ru.milandr.courses.farm.alfyorova.goods.Wool;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        GenericFarmer Vasya = new GenericFarmer();
        AngryFarmer Dan = new AngryFarmer();
        Cow cow = new Cow();
        Milk cowMilk = (Milk) cow.produceGoods();
        System.out.println(cowMilk);

        Animal chicken = new Chicken();
        Good eggChicken = chicken.produceGoods();
        System.out.println(eggChicken);

        Sheep sheep = new Sheep();
        Vasya.petAnAnimal(sheep);
        sheep.jump();
        Vasya.petAnAnimal(chicken);
        Dan.petAnAnimal(cow);

        Good milk = new Milk();
        Wool wool = new Wool();
        Vasya.collectGoods(wool);
        Vasya.eatProduct(milk);

        Dan.spoilGood(milk);
        Dan.spoilGood(wool);
        if (!milk.isItFresh())
            System.out.println("Angry Dan spoilt: " + milk);
        if (!wool.isItFresh())
            System.out.println("Angry Dan spoilt: " + wool);

        ArrayList<Good> goods = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            goods.add(new Milk());
            goods.add(new Eggs());
        }
        for (Good good : goods)
            Vasya.collectGoods(good);
        for (Good good : goods) {
            Vasya.eatProduct(good);
            try {
                Thread.sleep(15); //15 days after
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
