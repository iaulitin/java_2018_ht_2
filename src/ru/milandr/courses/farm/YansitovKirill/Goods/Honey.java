package ru.milandr.courses.farm.YansitovKirill.Goods;
import ru.milandr.courses.farm.YansitovKirill.Goods.SimpleGoods;

public class Honey extends SimpleGoods{
    private static boolean isInit = false;

    public Honey() {
        if(!isInit) {
            setRottenTime(1000);
            isInit = true;
        }
    }

    @Override
    public String toString() {
        return "Honey";
    }
}
