package ru.milandr.courses;

import ru.milandr.courses.farm.kuznetsov.*;

public class Application {
    public static void main(String[] args) {
        Farmer farmer = new Farmer("Vasiliy", 55, "Dmitrov", true);
        Pig pig = new Pig("Manya", 4, 500, false);
        Cow cow = new Cow("Murka", 6, "White");
        Chicken chicken = new Chicken("Cipa", 1, "Brown");

        farmer.petAnAnimal(cow);
        farmer.petAnAnimal(chicken);
        farmer.petAnAnimal(pig);

        GoodFromFarm milk = (GoodFromFarm) cow.produceGoods();
        GoodFromFarm meat = (GoodFromFarm) pig.produceGoods();
        GoodFromFarm eggs = (GoodFromFarm) chicken.produceGoods();

        farmer.collectGoods(milk);
        farmer.collectGoods(meat);
        farmer.collectGoods(eggs);

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        farmer.eatProduct(milk);
        farmer.eatProduct(meat);
        farmer.eatProduct(eggs);
    }
}
