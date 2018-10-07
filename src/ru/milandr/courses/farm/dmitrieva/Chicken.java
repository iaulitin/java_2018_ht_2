package ru.milandr.courses.farm.dmitrieva;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;

public class Chicken implements Animal{
    public String toString() {
        return "chicken";
    }


    @Override
    public void produceSound() {
        System.out.println("Bwok");
    }

    @Override
    public Good produceGoods() {
        return new Egg();
    }
}
