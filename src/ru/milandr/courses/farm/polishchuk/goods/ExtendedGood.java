package ru.milandr.courses.farm.polishchuk.goods;

import ru.milandr.courses.farm.Good;

public interface ExtendedGood extends Good {

    boolean isEaten();

    boolean isRotten();

    void eat();

    String getRottenName();

    String getGoodName();

}
