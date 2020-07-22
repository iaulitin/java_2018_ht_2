package ru.milandr.courses.farm.polishchuk.goods;

import ru.milandr.courses.farm.Good;

public class Milk implements Good {
    private double volume;
    private boolean rotten = false;
    private double daysToRot = 3.;
    private boolean eaten = false;

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setDaysToRot(double daysToRot) {
        this.daysToRot = daysToRot;
    }

    public double getDaysToRot() {
        return daysToRot;
    }

    public boolean isRotten() {
        return rotten;
    }

    public boolean isEaten() {
        return eaten;
    }

    public void eat() {
        eaten = true;
    }

    public Milk(double volume) {
        this.volume = volume;
    }

    public void dayPassed() {
        daysToRot -= 1.;
        if (daysToRot < 0.)
            this.goRotten();
    }

    public void goRotten() {
        this.rotten = true;
    }
}