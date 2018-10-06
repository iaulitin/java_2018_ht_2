package ru.milandr.courses.farm.ozherelev;

import ru.milandr.courses.farm.Good;


public class AnimalGoods implements Good
{
    private boolean isRotten;
    private boolean goingRotten;
    private double rottenTime;

    public void setGoingRotten(boolean goingRotten) {
        this.goingRotten = goingRotten;
    }

    public void setRotten(boolean rotten) {
        this.isRotten = rotten;
    }

    public void setRottenTime(double rottenTime) {
        this.rottenTime = rottenTime;
    }

    public double getRottenTime() {
        return this.rottenTime;
    }

    public boolean isGoingRotten() {
        return this.goingRotten;
    }

    public boolean isRotten() {
        return this.isRotten;
    }

    @Override
    public void goRotten() {
        if (this.goingRotten || this.isRotten)
            return;

        else {
            this.goingRotten = true;
            this.isRotten = false;
        }
    }
}
