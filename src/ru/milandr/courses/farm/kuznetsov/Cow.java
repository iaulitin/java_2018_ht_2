package ru.milandr.courses.farm.kuznetsov;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;

public class Cow implements Animal {
    private String name;
    private int age;
    private String colour;

    public Cow(String name, int age, String colour) {
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
        return "Cow";
    }

    @Override
    public void produceSound() {
        System.out.println("Cow: Moo");
    }

    @Override
    public Good produceGoods() {
        return new Milk();
    }
}
