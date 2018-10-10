package ru.milandr.courses.farm.perepelitsyn;

public class Milk extends Good {
    public Milk(){
        setRottenTime(20);
    }

    @Override
    public String toString() {
        return "milk";
    }
}
