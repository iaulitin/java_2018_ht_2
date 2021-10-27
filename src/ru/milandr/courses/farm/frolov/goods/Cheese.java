package ru.milandr.courses.farm.frolov.goods;

import ru.milandr.courses.farm.frolov.animals.SuperAnimal;

public class Cheese extends SuperGood {
    private static final long extendedTime = 30000;

    public Cheese(SuperAnimal animal) {
        super(animal);
    }

    public boolean isRotten() {
        long curTime = System.currentTimeMillis();
        isRotten = curTime > getCreationTime() + extendedTime;
        return isRotten;
    }
}
