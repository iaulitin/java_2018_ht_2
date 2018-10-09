package ru.milandr.courses.farm.dmitrieva;

import java.lang.Thread;

import ru.milandr.courses.farm.Good;

public class Egg extends AnimalGoods implements Good {

    public boolean isRotten;

    public Egg() {
        setRottenTime(1);
    }
    @Override
    public String toString() {
        return "egg";
    }
    public boolean getIsRotten() {
        return isRotten;
    }

}
