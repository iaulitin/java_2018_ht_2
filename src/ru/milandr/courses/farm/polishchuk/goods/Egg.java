package ru.milandr.courses.farm.polishchuk.goods;

import ru.milandr.courses.farm.Good;

public class Egg implements ExtendedGood {
    private final String GOOD_NAME = "Egg";
    private final String ROTTEN_NAME = "Egg from trash";

    private String color;
    private double weight;
    private boolean rotten = false;
    private boolean eaten = false;
    private double daysToRot = 5.;

    public Egg(double weight) {
        this.weight = weight;
    }

    public Egg(String color, double weight) {
        this(weight);
        this.color = color;
    }

    @Override
    public String getRottenName() {
        return ROTTEN_NAME;
    }

    @Override
    public String getGoodName() {
        return GOOD_NAME;
    }

    public void setColor() {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getDaysToRot() {
        return daysToRot;
    }

    public void setDaysToRot(double daysToRot) {
        this.daysToRot = daysToRot;
    }

    @Override
    public boolean isRotten() {
        return rotten;
    }

    @Override
    public void goRotten() {
        this.rotten = true;
    }

    @Override
    public boolean isEaten() {
        return eaten;
    }

    @Override
    public void eat() {
        eaten = true;
    }

    public void dayPassed() {
        daysToRot -= 1.;
        if (daysToRot < 0.)
            this.goRotten();
    }
}