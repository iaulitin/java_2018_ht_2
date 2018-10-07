package ru.milandr.courses.farm;

public class Chicken extends Animals implements Animal {
    @Override
    public String toString() {
        return "Chicken";
    }
    @Override
    public void produceSound() {
        System.out.println("pok pok");
    }
    @Override
    public Good produceGoods() {
        return new Eggs();
    }
}
