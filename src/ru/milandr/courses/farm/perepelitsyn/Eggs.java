package ru.milandr.courses.farm.perepelitsyn;

public class Eggs extends Good {
    public Eggs() {
        setRottenTime(20);
    }

    @Override
    public String toString() {
        return "egg";
    }
}
