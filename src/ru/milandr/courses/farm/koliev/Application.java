package ru.milandr.courses.farm.koliev;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.koliev.Goods.Egg;
import ru.milandr.courses.farm.koliev.Goods.Honey;
import ru.milandr.courses.farm.koliev.Goods.Milk;
import ru.milandr.courses.farm.koliev.Livestocks.Bee;
import ru.milandr.courses.farm.koliev.Livestocks.Chicken;
import ru.milandr.courses.farm.koliev.Livestocks.Cow;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        MyLittleFarmer farmer = new MyLittleFarmer();
        Cow cow = new Cow();
        ArrayList<Animal> animals = new ArrayList<>();

        for(int i = 0; i < 5; i++) {
            animals.add(new Cow());
            animals.add(new Chicken());
            animals.add(new Bee());
        }

        for (Animal animal: animals) {
            farmer.petAnAnimal(animal);
        }

        ArrayList<Good> goods = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            goods.add(new Honey());
            goods.add(new Milk());
            goods.add(new Egg());
        }
        for (Good good: goods)
            farmer.collectGoods(good);

        for (Good good: goods) {
            farmer.eatProduct(good);
            try {
                Thread.sleep( 1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
