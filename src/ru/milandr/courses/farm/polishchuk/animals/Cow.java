package ru.milandr.courses.farm.polishchuk.animals;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.polishchuk.goods.Egg;
import ru.milandr.courses.farm.polishchuk.goods.Meat;
import ru.milandr.courses.farm.polishchuk.goods.Milk;

public class Cow implements Animal {
    private final double MILK_VOLUME = 5.;
    private final double MAX_COW_WEIGHT = 1000.;
    private final double MIN_COW_WEIGHT = 200.;
    private final double COW_WEIGHT_4_100_PROBABILITY = 400.;
    private final double MILK_PRODUCE_PROBABILITY = 0.4;
    private final String COW_MILK_PRODUCING_SEX = "female";

    private String name;
    private double weight;
    private String sex;
    private boolean alive;

    public Cow(String name, double weight, String sex) {
        this.name = name;
        this.weight = weight;
        this.sex = sex;
    }

    public Cow(String name, double weight, String sex, boolean alive) {
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
        } else {
            System.out.println("Moo");
        }
    }

    @Override
    public Good produceGoods() {
        Good producedGood;

        producedGood = produceMilk();
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
        return new Meat("Cow", producedWeight);
    }

    private Milk produceMilk() {
        if (this.weight <= 0. || !this.alive || !this.sex.equalsIgnoreCase(COW_MILK_PRODUCING_SEX)) {
            return null;
        }
        if (this.weight > COW_WEIGHT_4_100_PROBABILITY || Math.random() > MILK_PRODUCE_PROBABILITY) {
            this.weight -= MILK_VOLUME;
            if (weight < MIN_COW_WEIGHT) {
                this.kill();
            }
            return new Milk(MILK_VOLUME);
        }
        return null;
    }

    public void feed(double foodWeight) {
        if (!this.alive)
            return;
        if (foodWeight > 0) {
            this.weight += foodWeight;
            if (this.weight > MAX_COW_WEIGHT) {
                this.kill();
            }
        }
    }

    public void kill() {
        this.alive = false;
    }
}