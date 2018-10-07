package ru.milandr.courses.farm.YansitovKirill.Goods;
import ru.milandr.courses.farm.YansitovKirill.Goods.SimpleGoods;

public class Egg extends SimpleGoods{
    private static boolean isInit = false;

    public Egg() {
        if(!isInit) {
            setRottenTime(10);
            isInit = true;
        }
    }

    @Override
    public String toString() {
        return "Egg";
    }
}
