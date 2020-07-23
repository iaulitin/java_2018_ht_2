package ru.milandr.courses.farm.polishchuk.goods;

import ru.milandr.courses.farm.Good;

public class Milk implements ExtendedGood {
    private final String GOOD_NAME = "Milk";
    private final String ROTTEN_NAME = "Kefir";

    private double volume;
    private boolean rotten = false;
    private double daysToRot = 3.;
    private boolean eaten = false;

    public Milk(double volume) {
        this.volume = volume;
    }

    @Override
    public String getRottenName() {
        return ROTTEN_NAME;
    }

    @Override
    public String getGoodName() {
        return GOOD_NAME;
    }

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

    @Override
    public boolean isRotten() {
        return rotten;
    }

    @Override
    public boolean isEaten() {
        return eaten;
    }

    @Override
    public void eat() {
        eaten = true;
    }

    @Override
    public void goRotten() {
        this.rotten = true;
    }

    public void dayPassed() {
        daysToRot -= 1.;
        if (daysToRot < 0.)
            this.goRotten();
    }

}