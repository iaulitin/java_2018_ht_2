package ru.milandr.courses.farm;

public class Milk extends Goods {

    @Override
    public String toString() {
        return "egg";
    }

    @Override
    public void goRotten() {
        setRottenTime(70);
    }
}