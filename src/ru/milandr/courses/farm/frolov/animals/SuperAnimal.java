package ru.milandr.courses.farm.frolov.animals;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;

public abstract class SuperAnimal implements Animal {
    protected String name;

    public SuperAnimal(String name) {
        this.name = name;
    }

    //стоит ли указывать наследуемый абстрактный метод, если здесь он не переписывается, или лучше сразу переписать в дочернем классе
    public abstract void produceSound();

    public abstract Good produceGoods();

    public String getName() {
        return name;
    }
}
