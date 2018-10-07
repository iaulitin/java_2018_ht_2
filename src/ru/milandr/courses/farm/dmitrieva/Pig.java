package ru.milandr.courses.farm.dmitrieva;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;

public class Pig implements Animal {
    public String toString() {
        return "pig";
    }


    @Override
    public void produceSound() {
        System.out.println("Oink");
    }

    @Override
    public Good produceGoods() {
        return null;
    }
}
