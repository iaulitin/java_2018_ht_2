package ru.milandr.courses.farm.vorobyev.animal;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.vorobyev.good.Milk;

public class Cow implements Animal {



    public String whatCowHeard(String sound) {
        return sound;
    }
    @Override
    public void produceSound() {
        System.out.println("Moo");
    }

    @Override
    public Good produceGoods() {
        return new Milk();
    }

    @Override
    public String toString() {
        return "Cow";
    }
}
