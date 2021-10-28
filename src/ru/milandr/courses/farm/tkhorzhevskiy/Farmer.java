package ru.milandr.courses.farm.tkhorzhevskiy;


import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.GenericFarmer;
import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.tkhorzhevskiy.goods.Egg;
import ru.milandr.courses.farm.tkhorzhevskiy.goods.Meat;
import ru.milandr.courses.farm.tkhorzhevskiy.goods.Milk;
import ru.milandr.courses.farm.tkhorzhevskiy.goods.ParentGood;

public class Farmer implements GenericFarmer {
    private String name;

    public Farmer (String name) {
        this.name = name;
    }

    @Override
    public void collectGoods(Good good) {
        if (good instanceof Milk) {
            System.out.println(name + " подоил корову");
            return;
        }
        if (good instanceof Egg) {
            System.out.println(name + " собрал яйцо");
            return;
        }
        if (good instanceof Meat) {
            System.out.println(name + " зарезал свинью");
        }
    }
    @Override
    public void petAnAnimal(Animal animal) {
        System.out.println(name + " погладил " + animal);
        animal.produceSound();

    }

    @Override
    public void eatProduct(Good good) {
        ParentGood currGood = (ParentGood) good;
        if (currGood.isRotten(false)){
            System.out.println("Фу, протухло "+ good);
            return;}
        if (good instanceof Milk){
            System.out.println(name + " выпил молока");
            return;
        }
        if (good instanceof Egg){
            System.out.println(name + " скушал яйцо");
            return;        }
        if (good instanceof Meat){
            System.out.println(name + " съел мясо");
            
        }

    }
}
