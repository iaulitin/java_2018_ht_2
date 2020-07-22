package ru.milandr.courses.farm.polishchuk.goods;

import ru.milandr.courses.farm.Good;

public class Egg implements Good {
    private String color;
    private double weight;
    private boolean rotten = false;
    private double daysToRot = 5.;
    private boolean eaten = false;

    public void setColor() {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public boolean isEaten() {
        return eaten;
    }

    public void eat() {
        eaten = true;
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

    public boolean isRotten() {
        return rotten;
    }

    public Egg(double weight) {
        this.weight = weight;
    }

    public Egg(String color, double weight) {
        this(weight);
        this.color = color;
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