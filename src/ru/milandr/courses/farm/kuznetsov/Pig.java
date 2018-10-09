package ru.milandr.courses.farm.kuznetsov;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;

public class Pig implements Animal {
    private String name;
    private int age;
    private int weight;
    private boolean isNapDirty;

    public Pig(String name, int age, int weight, boolean isNapDirty) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isNapDirty = isNapDirty;
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isNapDirty() {
        return isNapDirty;
    }

    public void setNapDirty(boolean napDirty) {
        isNapDirty = napDirty;
    }

    public void takeNapInDirt() {
        this.setNapDirty(true);
    }

    public String toString() {
        return "Pig";
    }

    @Override
    public void produceSound() {
        System.out.println("Pig: Oink");
    }

    @Override
    public Good produceGoods() {
        return new Meat();
    }
}
