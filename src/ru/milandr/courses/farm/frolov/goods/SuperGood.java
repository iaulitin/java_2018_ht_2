package ru.milandr.courses.farm.frolov.goods;

import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.frolov.animals.SuperAnimal;

public abstract class SuperGood implements Good {
    protected boolean isRotten = false;
    private static short count = 0;
    private long creationTime;
    private SuperAnimal animal;


    public SuperGood(SuperAnimal animal) {
        count++;
        this.creationTime = System.currentTimeMillis();
        this.animal = animal;
    }

    @Override
    public void goRotten() {
        isRotten = true;
        count--;
    }

    public void getGood() {
        System.out.println("Получена продукция, всего " + count + " шт.");
    }

    public void setRotten(boolean rotten) {
        isRotten = rotten;
    }

    public long getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(long creationTime) {
        this.creationTime = creationTime;
    }
}
