package ru.milandr.courses.farm.YansitovKirill;

import ru.milandr.courses.farm.FarmerJohn;
import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.YansitovKirill.*;
import ru.milandr.courses.farm.YansitovKirill.Animals.Bee;
import ru.milandr.courses.farm.YansitovKirill.Animals.Cow;
import ru.milandr.courses.farm.YansitovKirill.Animals.Hen;


public class Application {

    public static void main(String[] args) {

        FarmerJohn farmerJohn = new FarmerJohn();
        Cow cow1 = new Cow();
        Cow cow2 = new Cow();
        Hen hen1 = new Hen();
        Bee bee1 = new Bee();

        farmerJohn.petAnAnimal(bee1);
        farmerJohn.petAnAnimal(cow1);
        farmerJohn.petAnAnimal(cow2);
        farmerJohn.petAnAnimal(hen1);

        Good good;

        good = cow1.produceGoods();
        farmerJohn.collectGoods(good);

        good = hen1.produceGoods();
        farmerJohn.collectGoods(good);

        good = bee1.produceGoods();
        farmerJohn.collectGoods(good);

        farmerJohn.printCollectGoods();

        good = cow2.produceGoods();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        farmerJohn.eatProduct(good);
    }
}
