package ru.milandr.courses.farm.khaidukov

import java.util.List;
import java.util.ArrayList;

public class Farmer implements GenericFarmer {
    List<Good> goods = new ArrayList<>();
    private boolean isAngry = false;

    public List<Good> getGoods() {
        return goods;
    }

    public void setGoods(List<Good> goods) {
        this.goods = goods;
    }

    public boolean isAngry() {
        return isAngry;
    }

    public void setAngry(boolean angry) {
        isAngry = angry;
    }

    @Override
    public void collectGoods(Good good) {
        this.goods.add(good);
    }

    @Override
    public void petAnAnimal(Animal animal) {
        System.out.printf ("Hello, %s\n", animal);
        animal.produceSound();
    }

    @Override
    public void eatProduct(Good good) {
        Goods item = (Goods) good;
        if (item.isRotten()){
            isAngry = true;
            return;
        }

        if (item instanceof Milk){
            System.out.println("Oh, I can make coffee!\n");
        } else if (item instanceof Wool){
            System.out.println("Oh, I can make socks!\n");
        } else if (item instanceof Egg){
            System.out.println("Oh, I can make gogol-mogol!\n");
        }
    }
}
