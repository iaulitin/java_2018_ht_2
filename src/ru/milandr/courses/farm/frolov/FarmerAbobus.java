package ru.milandr.courses.farm.frolov;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.GenericFarmer;
import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.frolov.animals.Pig;
import ru.milandr.courses.farm.frolov.goods.Meat;
import ru.milandr.courses.farm.frolov.goods.SuperGood;

public class FarmerAbobus implements GenericFarmer {
    private final String name;

    public FarmerAbobus(String name) {
        this.name = name;
    }

    @Override
    public void collectGoods(Good good) {
        ((SuperGood) good).getCollected(this);
    }

    // можно ли сразу перегрузить метод (не писать того, что написано выше)
    public Good collectGoods(Pig pig) {
        Good meat = pig.produceGoods();
        ((Meat) meat).getCollected(this);
        return meat;
    }

    @Override
    public void petAnAnimal(Animal animal) {
        System.out.println(name + " погладил " + animal);
        animal.produceSound();
    }

    @Override
    public void eatProduct(Good good) {
        SuperGood realGood = (SuperGood) good;
        if (realGood.isRotten()) {
            System.out.println("не хочу есть испорченный " + realGood);
            return;
        }
        System.out.println(name + " употребил " + realGood);
    }

    public String getName() {
        return name;
    }
}
