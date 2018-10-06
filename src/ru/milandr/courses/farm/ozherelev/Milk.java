package ru.milandr.courses.farm.ozherelev;

public class Milk extends AnimalGoods {
    public Milk()
    {
        this.setRottenTime(2.00);
    }

    @Override
    public String toString() {
        return "milk";
    }
}
