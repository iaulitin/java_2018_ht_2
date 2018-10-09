package ru.milandr.courses.farm.filippova;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;

public class Cow implements Animal {
    private int age;
    private int numberOfCalves;
    private String name;


    Cow(int a, int k, String n) {
        age = a;
        numberOfCalves = k;
        name = n;
    }

    public static void type(Cow cow) {
        if (cow.age < 5) {
            System.out.println("Young cow");
        }
        if (cow.age >= 5) {
            System.out.println("Old cow");
        }
    }
    public int getNumberOfCalves() {
        return this.numberOfCalves;
    }

    public void setNumberOfCalves(int numberOfCalves) {
        this.numberOfCalves = numberOfCalves;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void produceSound() {
        System.out.println("Mooow");

    }

    @Override
    public Good produceGoods() {
        Good milk = new Milk(false, false, 2000);
        return milk;
    }
}
