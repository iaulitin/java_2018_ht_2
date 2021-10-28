package ru.milandr.courses.farm.tkhorzhevskiy.goods;

public class Egg extends ParentGood {
    public Egg() {
        isRotten(false);
        setName("Яйцо");
        setRotTime(7);
        setGatherTime(1);
    }
    @Override
    public String toString() {
        return this.getName();
    }

}



