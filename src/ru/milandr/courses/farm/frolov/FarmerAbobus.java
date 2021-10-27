package ru.milandr.courses.farm.frolov;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.GenericFarmer;
import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.frolov.animals.SuperAnimal;
import ru.milandr.courses.farm.frolov.goods.Cheese;
import ru.milandr.courses.farm.frolov.goods.Meat;
import ru.milandr.courses.farm.frolov.goods.Milk;
import ru.milandr.courses.farm.frolov.goods.SuperGood;

public class FarmerAbobus implements GenericFarmer {
    private String name;

    public FarmerAbobus(String name) {
        this.name = "Абобус " + name;
    }

    @Override
    public void collectGoods(Good good) {
        SuperGood realGood = (SuperGood) good;
        if (realGood instanceof Milk) {
            System.out.println(name + " подоил корову");
            return;
        }
        if (realGood instanceof Cheese) {
            System.out.println(name + " подоил козу и сварил сыр");
            return;
        }
        if (realGood instanceof Meat) {
            System.out.println(name + " заколол свинью");
        }
    }

    @Override
    public void petAnAnimal(Animal animal) {
        System.out.println(name + " погладил " + animal);
        animal.produceSound();
    }

    @Override
    public void eatProduct(Good good) {
        SuperGood realGood = (SuperGood) good;
        if (realGood instanceof Milk && !((Milk) realGood).isRotten()) {
            System.out.println(name + " выпил молока");
            return;
        }
        if (realGood instanceof Cheese && !((Cheese) realGood).isRotten()) {
            System.out.println(name + " съел козьего сыра");
            return;
        }
        if (realGood instanceof Meat && !((Meat) realGood).isRotten()) {
            System.out.println(name + " съел мяса");
            return;
        }
        System.out.println("Нечего есть. Все испортилось.");
    }

    public String getName() {
        return name;
    }
}
