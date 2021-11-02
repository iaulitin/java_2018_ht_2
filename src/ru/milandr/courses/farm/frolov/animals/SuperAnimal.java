package ru.milandr.courses.farm.frolov.animals;

import ru.milandr.courses.farm.Animal;

public abstract class SuperAnimal implements Animal {
    protected String name;

    public SuperAnimal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
