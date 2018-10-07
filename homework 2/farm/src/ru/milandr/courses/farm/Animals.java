package ru.milandr.courses.farm;

public class Animals implements Animal {
    @Override
    public void produceSound() {
        System.out.println("error");
    }
    @Override
    public Good produceGoods() {
        return new Goods();
    }
}