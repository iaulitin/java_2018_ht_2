package ru.milandr.courses.farm;

public class Meat extends Goods {

    @Override
    public String toString() {
        return "meat";
    }

    @Override
    public void goRotten() {
        setRottenTime(80);
    }
}
