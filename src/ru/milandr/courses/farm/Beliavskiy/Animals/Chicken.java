package ru.milandr.courses.farm.Beliavskiy.Animals;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Beliavskiy.Goods.Eggs;
import ru.milandr.courses.farm.Good;

public class Chicken implements Animal {

    @Override
    public void produceSound(){
        System.out.println("Kukareku");
    }

    @Override
    public Good produceGoods(){
        return new Eggs();
    }

    @Override
    public String toString()
    {
        return "chicken";
    }

}
