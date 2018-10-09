package ru.milandr.courses.farm.Beliavskiy.Goods;


public class Milk extends GoodBehavior {

    public Milk () {
        super();
        setRotTime(5);
    }

    @Override
    public String toString() {
        return "milk";
    }

}
