package ru.milandr.courses.farm.polishchuk.animals;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.polishchuk.goods.Egg;
import ru.milandr.courses.farm.polishchuk.goods.Meat;

public class Cock implements Animal {
    private final double EGG_WEIGHT = 0.05;
    private final double MAX_COCK_WEIGHT = 10.;
    private final double MIN_COCK_WEIGHT = 1.;
    private final double COCK_WEIGHT_4_100_PROBABILITY = 4.;
    private final double EGG_PRODUCE_PROBABILITY = 0.4;
    private final double BLACK_EGG_PROBABILITY = 0.2;
    private final String COCK_EGG_PRODUCING_SEX = "female";

    private String name;
    private double weight;
    private String sex;
    private boolean alive = true;

    public Cock(String name, double weight, String sex) {
        this.name = name;
        this.weight = weight;
        this.sex = sex;
    }

    public Cock(String name, double weight, String sex, boolean alive) {
        this(name, weight, sex);
        this.alive = alive;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public boolean isAlive() {
        return this.alive;
    }

    @Override
    public void produceSound() {
        if (!this.alive) {
            System.err.println("*dead, no sound produced*");
        } else if (this.sex.equalsIgnoreCase("male")) {
            System.out.println("Nado v cochalochky");
        } else if (this.sex.equalsIgnoreCase("female")) {
            System.out.println("Co-Co-Co");
        } else {
            System.err.println("*sex undefined, no sound produced*");
        }
    }

    @Override
    public Good produceGoods() {
        Good producedGood;

        producedGood = produceEgg();
        if (producedGood == null){
            producedGood = produceMeat();
        }
        return producedGood;
    }

    private Meat produceMeat() {
        double producedWeight;

        if (this.weight <= 0.)
            return null;
        if (this.alive) {
            this.kill();
        }
        producedWeight = this.weight;
        this.weight = 0.;
        return new Meat("Cock", producedWeight);
    }

    private Egg produceEgg() {
        if (this.weight <= 0. || !this.alive || !this.sex.equalsIgnoreCase(COCK_EGG_PRODUCING_SEX)) {
            return null;
        }
        if (this.weight > COCK_WEIGHT_4_100_PROBABILITY || Math.random() > EGG_PRODUCE_PROBABILITY) {
            this.weight -= EGG_WEIGHT;
            if (weight < MIN_COCK_WEIGHT) {
                this.kill();
            }
            if (Math.random() < BLACK_EGG_PROBABILITY) {
                return new Egg("black", EGG_WEIGHT);
            } else {
                return new Egg("white", EGG_WEIGHT);
            }
        }
        return null;
    }

    public void feed(double foodWeight) {
        if (!this.alive)
            return;
        if (foodWeight > 0) {
            this.weight += foodWeight;
            if (this.weight > MAX_COCK_WEIGHT) {
                this.kill();
            }
        }
    }

    public void kill() {
        this.alive = false;
    }
}