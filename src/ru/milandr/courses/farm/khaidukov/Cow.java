package ru.milandr.courses.farm.khaidukov

public class Cow implements Animal {
    @Override
    public String toString() {
        return "Cow";
    }

    @Override
    public void produceSound() {
        System.out.println("Muuuuuuuuuu!\n");
    }

    @Override
    public Good produceGoods() {
        return new Milk();
    }
}
