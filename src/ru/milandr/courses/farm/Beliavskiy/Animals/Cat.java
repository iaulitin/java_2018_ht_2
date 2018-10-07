package ru.milandr.courses.farm.Beliavskiy.Animals;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Beliavskiy.Goods.Dead_Mouses;
import ru.milandr.courses.farm.Good;

public class Cat implements Animal {

    @Override
    public void produceSound(){
        System.out.println("Meow");
    }

    @Override
    public Good produceGoods(){
        return new Dead_Mouses();
    }

    @Override
    public String toString()
    {
        return "cat";
    }

}
