package ru.milandr.courses.farm.frolov.animals;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;

public class SuperAnimal implements Animal {
    private String name;

    public SuperAnimal(String name) {
        this.name = name;
    }

    @Override
    public void produceSound() {
        System.out.println("какие-то животные звуки");
    }

    @Override
    public Good produceGoods() {
        return null;
    }

    public String getName() {
        return name;
    }
}
