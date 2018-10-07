package ru.milandr.courses.farm.khaidukov

public class Chicken implements Animal {
    @Override
    public String toString() {
        return "Chicken";
    }

    @Override
    public void produceSound() {
        System.out.println("Ko-ko-ko-ko!\n");
    }

    @Override
    public Good produceGoods() {
        return new Egg();
    }
}
