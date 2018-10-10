package ru.milandr.courses.farm.perepelitsyn;

public class Wool extends Good {

    public Wool(){
        setRottenTime(10);
    }

    @Override
    public String toString() {
        return "wool";
    }
}
