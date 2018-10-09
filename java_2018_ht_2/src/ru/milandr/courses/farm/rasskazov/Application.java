package ru.milandr.courses.farm.rasskazov;

import ru.milandr.courses.farm.rasskazov.goods.Egg;
import ru.milandr.courses.farm.rasskazov.goods.Meat;
import ru.milandr.courses.farm.rasskazov.pets.Chicken;
import ru.milandr.courses.farm.rasskazov.pets.Cow;
import ru.milandr.courses.farm.rasskazov.pets.Sheep;

public class Application {
    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        Cow cow = new Cow();
        Sheep sheep = new Sheep();
    }
}
