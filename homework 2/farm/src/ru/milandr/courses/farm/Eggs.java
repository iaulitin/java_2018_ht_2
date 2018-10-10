package ru.milandr.courses.farm;

public class Eggs extends Goods {

    @Override
    public String toString() {
        return "egg";
    }

    @Override
    public void goRotten() {
        setRottenTime(70);
    }
}