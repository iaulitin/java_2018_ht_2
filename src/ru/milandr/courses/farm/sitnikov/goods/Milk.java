package ru.milandr.courses.farm.sitnikov.goods;

public class Milk extends SimpleGood {
    public Milk() {
        super();
        setRottenTime(4);
    }

    @Override
    public String toString() {
        return "молоко";
    }
}
