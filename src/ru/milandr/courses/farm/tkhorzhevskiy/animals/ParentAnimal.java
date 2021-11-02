package ru.milandr.courses.farm.tkhorzhevskiy.animals;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;


public abstract class ParentAnimal implements Animal {
    protected String name;
    protected boolean isAlive;

    public ParentAnimal() {
        this.isAlive = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }


    @Override
    public void produceSound() {
        System.out.println("Какой то звук");

    }

    @Override
    public Good produceGoods() {
        return null;
    }

    public String toString() {
        return this.getName();
    }


}
