package ru.milandr.courses;

import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.Beliavskiy.Animals.Chicken;
import ru.milandr.courses.farm.Beliavskiy.Animals.Cow;
import ru.milandr.courses.farm.Beliavskiy.Animals.Cat;
import ru.milandr.courses.farm.Beliavskiy.Farmer;

public class Application {
    public static void main(String[] args) {
        Farmer farmer = new Farmer();
        Cow cow = new Cow();
        Cat cat = new Cat();
        Chicken chicken = new Chicken();
        System.out.println("created 3 animals: cow, cat, chicken");

        farmer.petAnAnimal(cow);

        farmer.petAnAnimal(cat);

        farmer.petAnAnimal(chicken);

        Good milk = cow.produceGoods();
        farmer.eatProduct(milk);

        Good egg = chicken.produceGoods();
        farmer.eatProduct(egg);

        Good dead_mouse = cat.produceGoods();
        farmer.eatProduct(dead_mouse);
    }
}
