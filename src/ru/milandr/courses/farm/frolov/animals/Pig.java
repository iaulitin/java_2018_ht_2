package ru.milandr.courses.farm.frolov.animals;

import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.frolov.goods.Meat;

public class Pig extends SuperAnimal {
    private boolean isAlive;

    public Pig(String name) {
        super(name);
        isAlive = true;
    }

    @Override
    public String toString() {
        return "Свинка " + getName();
    }

    @Override
    public void produceSound() {
        if (isAlive) {
            System.out.println("хрю-хрю");
        } else {
            System.out.println("<<загробные звуки>> хрю-хрю");
        }
    }

    @Override
    public Good produceGoods() {
        if (isAlive) {
            isAlive = false;
            return new Meat(this);
        } else {
            System.out.println("Свинка " + getName() + "уже отдала свое мясо.");
            return null;
        }
    }

}
