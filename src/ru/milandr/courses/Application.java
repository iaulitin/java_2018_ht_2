package ru.milandr.courses.farm.Marshinin;

import ru.milandr.courses.farm.Marshinin.Animals.Cow;
import ru.milandr.courses.farm.Marshinin.Animals.Bee;
import ru.milandr.courses.farm.Marshinin.Animals.Chicken;
import ru.milandr.courses.farm.Marshinin.Goods.Honey;
import ru.milandr.courses.farm.Marshinin.Goods.Eggs;
import ru.milandr.courses.farm.Marshinin.Goods.Milk;

public class Application {
    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        Cow cow = new Cow();
        Bee bee = new Bee();
        Milk milk = (Milk) cow.produceGoods();
        Eggs eggs = (Eggs) chicken.produceGoods();
        Honey honey = (Honey) bee.produceGoods();

        milk.goRotten();

        Farmer farmer = new Farmer();

        farmer.collectGoods(milk);
        farmer.collectGoods(honey);
        farmer.collectGoods(eggs);
        farmer.eatProduct(milk);
        farmer.farmerMood();

        farmer.eatProduct(honey);
        farmer.farmerMood();
        farmer.eatProduct(eggs);
        farmer.farmerMood();
        farmer.eatProduct(milk);
        farmer.farmerMood();

        Bee.pollinateTheFlower();
        goat.showTongue();
        System.out.println(cow.whatCowHeard("bebebe"));
        dan.petAnAnimal(cow);
        dan.petAnAnimal(hen);
        dan.petAnAnimal(goat);
    }
}