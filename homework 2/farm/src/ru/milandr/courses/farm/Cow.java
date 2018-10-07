package ru.milandr.courses.farm;

public class Cow extends Animals implements Animal {
    @Override
    public String toString() {
        return "Cow";
    }
    @Override
    public void produceSound() {
        System.out.println("my my");
    }
    @Override
    public Good produceGoods() {
        return new Milk();
    }
}