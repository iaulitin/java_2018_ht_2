package ru.milandr.courses.farm.tkhorzhevskiy.goods;

public class Milk extends ParentGood{
    public Milk() {
        isRotten(false);
        setName("Молоко");
        setRotTime(10);
        setGatherTime(4);
    }
    @Override
    public String toString() {
        return this.getName();
    }
}
