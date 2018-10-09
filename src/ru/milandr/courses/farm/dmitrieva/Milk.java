package ru.milandr.courses.farm.dmitrieva;

import ru.milandr.courses.farm.Good;

public class Milk extends AnimalGoods implements Good {
    public boolean isRotten;

    public Milk() {
        setRottenTime(500);
    }
    @Override
    public String toString() {
        return "milk";
    }

    public boolean getIsRotten() {
        return isRotten;
    }
}
