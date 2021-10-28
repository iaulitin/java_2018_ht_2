package ru.milandr.courses.farm.tkhorzhevskiy.goods;


public class Meat extends ParentGood {

    public Meat() {
        isRotten(false);
        setName("Мясо");
        setRotTime(11);
        setGatherTime(5);
    }
    @Override
    public String toString() {
        return this.getName();
    }
}
