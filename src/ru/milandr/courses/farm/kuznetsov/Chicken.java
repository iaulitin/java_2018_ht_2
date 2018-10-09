package ru.milandr.courses.farm.kuznetsov;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;

public class Chicken implements Animal {
    private String name;
    private int age;
    private String colour;

    public Chicken(String name, int age, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Chicken";
    }

    @Override
    public void produceSound() {
        System.out.println("Chicken: Cluck-cluck");
    }

    @Override
    public Good produceGoods() {
        return new Egg();
    }
}
