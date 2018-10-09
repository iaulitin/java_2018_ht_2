package ru.milandr.courses.farm.dmitrieva;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.GenericFarmer;
import ru.milandr.courses.farm.Good;

public class Farmer implements GenericFarmer {
    @Override
    public void collectGoods(Good good) {
        System.out.println(good);
    }

    @Override
    public void petAnAnimal(Animal animal) {
        animal.produceSound();
        System.out.println("Hello " +animal.toString());
    }

    @Override
    public void eatProduct(Good good) {
        AnimalGoods meal = (AnimalGoods) good;
        if (meal.isRotten){
            System.out.println("It is rotten");
            return;
        }
        if (good instanceof Milk) {
            System.out.println("Mmm fresh milk");
        } else if (good instanceof Egg) {
            System.out.println("Tasty eggs");
        }
    }
}

