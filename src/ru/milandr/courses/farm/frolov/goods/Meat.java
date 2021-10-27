package ru.milandr.courses.farm.frolov.goods;


import ru.milandr.courses.farm.frolov.animals.Pig;
import ru.milandr.courses.farm.frolov.animals.SuperAnimal;

public class Meat extends SuperGood {
    private static final long extendedTime = 20000;

    public Meat(SuperAnimal animal) {
        super(animal);
        animal.produceGoods();
    }

    public boolean isRotten() {
        long curTime = System.currentTimeMillis();
        isRotten = curTime > getCreationTime() + extendedTime;
        return isRotten;
    }

}
