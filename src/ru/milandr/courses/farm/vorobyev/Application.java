package ru.milandr.courses.farm.vorobyev;

import ru.milandr.courses.farm.vorobyev.animal.Cow;
import ru.milandr.courses.farm.vorobyev.animal.Goat;
import ru.milandr.courses.farm.vorobyev.animal.Hen;
import ru.milandr.courses.farm.vorobyev.good.Cheese;
import ru.milandr.courses.farm.vorobyev.good.Egg;
import ru.milandr.courses.farm.vorobyev.good.Milk;


public class Application {
    public static void main(String[] args) {
        Hen hen = new Hen();
        Cow cow = new Cow();
        Goat goat = new Goat();

        Milk milk = (Milk) cow.produceGoods();
        Cheese cheese = (Cheese) goat.produceGoods();
        Egg egg = (Egg) hen.produceGoods();

        milk.goRotten();

        FarmerDan dan = new FarmerDan();

        dan.collectGoods(milk);
        dan.collectGoods(cheese);
        dan.collectGoods(egg);

        dan.eatProduct(milk);
        dan.farmerMood();
        dan.eatProduct(cheese);
        dan.farmerMood();
        dan.eatProduct(egg);
        dan.farmerMood();
        dan.eatProduct(egg);
        dan.farmerMood();

        hen.goCrazy();

        goat.showTongue();

        System.out.println(cow.whatCowHeard("bebebe"));

        dan.petAnAnimal(cow);
        dan.petAnAnimal(hen);
        dan.petAnAnimal(goat);

    }
}
