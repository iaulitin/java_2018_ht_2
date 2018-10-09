package ru.milandr.courses.farm.dmitrieva;

import java.lang.String;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;

public class Cow implements Animal {

    public String toString() {
        return "cow";
    }

    @Override
    public void produceSound() {
        System.out.println("Moo");
    }

    @Override
    public Good produceGoods() {
        return new Milk();
    }
}
