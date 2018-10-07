package ru.milandr.courses.farm.YansitovKirill.Goods;
import ru.milandr.courses.farm.YansitovKirill.Goods.SimpleGoods;

public class Milk extends SimpleGoods{
    private static boolean isInit = false;

    public Milk() {
        if(!isInit) {
            setRottenTime(50);
            isInit = true;
        }
    }

    @Override
    public String toString() {
        return "Milk";
    }
}
