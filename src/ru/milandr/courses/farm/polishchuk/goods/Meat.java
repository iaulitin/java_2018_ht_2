package ru.milandr.courses.farm.polishchuk.goods;

import ru.milandr.courses.farm.Good;

public class Meat implements Good {
    private String producer;
    private double weight;
    private boolean rotten = false;
    private boolean eaten = false;
    private double daysToRot = 3.;

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getProducer() {
        return producer;
    }

    public double getDaysToRot() {
        return daysToRot;
    }

    public void setDaysToRot(double daysToRot) {
        this.daysToRot = daysToRot;
    }

    public boolean isEaten() {
        return eaten;
    }

    public boolean isRotten() {
        return rotten;
    }

    public Meat(String producer, double weight) {
        this.producer = producer;
        this.weight = weight;
    }

    public void eat() {
        this.eaten = true;
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