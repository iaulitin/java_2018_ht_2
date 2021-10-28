package ru.milandr.courses.farm.tkhorzhevskiy;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.tkhorzhevskiy.animals.Chicken;
import ru.milandr.courses.farm.tkhorzhevskiy.animals.Cow;
import ru.milandr.courses.farm.tkhorzhevskiy.animals.Pig;
import ru.milandr.courses.farm.tkhorzhevskiy.goods.Egg;
import ru.milandr.courses.farm.tkhorzhevskiy.goods.Meat;
import ru.milandr.courses.farm.tkhorzhevskiy.goods.Milk;

public class Application {
    public static void main(String[] args) {
        Farmer volodya = new Farmer("Володя");
        Animal cow = new Cow();
        Animal pig = new Pig();
        Animal chicken = new Chicken();
        Good milk = new Milk();
        Good meat = new Meat();
        Good egg = new Egg();


        volodya.petAnAnimal(cow);
        volodya.petAnAnimal(pig);
        volodya.petAnAnimal(chicken);
        volodya.collectGoods(meat);
        volodya.collectGoods(egg);
        volodya.collectGoods(milk);
        volodya.eatProduct(milk);
        volodya.eatProduct(egg);
        volodya.eatProduct(meat);
        milk.goRotten();
        volodya.eatProduct(milk);


    }
}
