package ru.milandr.courses;

import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.dmitrieva.*;


public class Application {
    public static void main(String[] args) {
        Farmer farmer = new Farmer();
        Egg egg = new Egg();
        Milk milk = new Milk();
        egg.goRotten();
        farmer.collectGoods(egg);
        farmer.collectGoods(milk);
        System.out.println(egg.isRotten());
        Cow cow = new Cow();
        Pig pig = new Pig();
        Chicken chicken = new Chicken();
        farmer.petAnAnimal(chicken);
        farmer.petAnAnimal(cow);
        farmer.petAnAnimal(pig);
        farmer.eatProduct(egg);
        farmer.eatProduct(milk);

    }
}
