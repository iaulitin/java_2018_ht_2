package ru.milandr.courses.farm;

public class Pig extends Animals implements Animal {
    @Override
    public String toString() {
        return "Pig";
    }
    @Override
    public void produceSound() {
        System.out.println("hru hru");
    }
    @Override
    public Good produceGoods() {
        return new Meat();
    }
}