package ru.milandr.courses.farm.tkhorzhevskiy.animals;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.tkhorzhevskiy.goods.Meat;

public class Pig implements Animal {
    private boolean isAlive = true;

    @Override
    public void produceSound() {
        if (!isAlive) {
            System.out.println("Свинья отсутствует");

            return;
        }
        System.out.println("За альянс!");
    }

    @Override
    public Good produceGoods() {
        if (!isAlive) {
            System.out.println("Свинья отсутствует");
        } else {
            return new Meat();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Свинья";
    }


}
