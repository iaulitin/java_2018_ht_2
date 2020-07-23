package ru.milandr.courses.farm.polishchuk.goods;

import ru.milandr.courses.farm.Good;

public class Meat implements ExtendedGood {
    private final String GOOD_NAME = "Meat";
    private final String ROTTEN_NAME = "Deadman's flesh";

    private String producer;
    private double weight;
    private boolean rotten = false;
    private boolean eaten = false;
    private double daysToRot = 3.;

    public Meat(String producer, double weight) {
        this.producer = producer;
        this.weight = weight;
    }

    @Override
    public String getRottenName() {
        return ROTTEN_NAME;
    }

    @Override
    public String getGoodName() {
        return GOOD_NAME;
    }

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

    @Override
    public boolean isEaten() {
        return eaten;
    }

    @Override
    public boolean isRotten() {
        return rotten;
    }

    @Override
    public void eat() {
        this.eaten = true;
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