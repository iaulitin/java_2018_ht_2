package ru.milandr.courses.farm;


import ru.milandr.courses.farm.YansitovKirill.Goods.SimpleGoods;

import java.util.ArrayList;
import java.util.List;

public class FarmerJohn implements GenericFarmer {
    private List<Good> collectedGoods;


    public FarmerJohn() {
        collectedGoods = new ArrayList<Good>();
    }


    @Override
    public void collectGoods(Good good) {
        collectedGoods.add(good);
        System.out.println("John collect " + good);
    }


    public void printCollectGoods() {
        System.out.println("John collect:\n");
        System.out.println(collectedGoods);
    }


    @Override
    public void petAnAnimal(Animal animal) {
        System.out.print("FarmerJonh says: Hello, "+animal + ".\n"+ animal+"says: ");
        animal.produceSound();
    }


    @Override
    public void eatProduct(Good good) {
        SimpleGoods sgood = (SimpleGoods)good;
        if(sgood.isRotten())
        {
            System.out.println("John ate rotten " + good + ". FarmerJohn is ANGRY!!!");
        }
    }
}
