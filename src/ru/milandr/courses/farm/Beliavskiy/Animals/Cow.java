package ru.milandr.courses.farm.Beliavskiy.Animals;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Beliavskiy.Goods.Milk;
import ru.milandr.courses.farm.Good;

public class Cow implements Animal {

    @Override
    public void produceSound(){
        System.out.println("Moo");
    }

    @Override
    public Good produceGoods(){
        return new Milk();
    }

    @Override
    public String toString()
    {
        return "cow";
    }

}
