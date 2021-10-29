package ru.milandr.courses.farm.frolov.goods;

import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.frolov.FarmerAbobus;

public abstract class SuperGood implements Good {
    private boolean isRotten;
    private final long creationTime;
    protected long extendedTime;

    public SuperGood() {
        isRotten = false;
        creationTime = System.currentTimeMillis();
    }

    @Override
    public void goRotten() {
        if (isRotten) {
            System.out.println(this + " уже испорчено");
            return;
        }
        if (checkTime()) {
            System.out.println(this + " испортилось");
            return;
        }
        System.out.println("Срок годности" + this + " еще не закончился");
    }


    public abstract void getCollected(FarmerAbobus farmer);

    public boolean isRotten() {
        isRotten = checkTime();
        return isRotten;
    }

    private boolean checkTime() {
        return System.currentTimeMillis() > creationTime + extendedTime;
    }

}
