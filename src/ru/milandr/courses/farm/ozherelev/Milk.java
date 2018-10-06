package ru.milandr.courses.farm.ozherelev;

public class Milk extends AnimalGoods {
    public Milk()
    {
        this.setRottenTime(2000);
    }

    @Override
    public String toString() {
        return "milk";
    }
}
