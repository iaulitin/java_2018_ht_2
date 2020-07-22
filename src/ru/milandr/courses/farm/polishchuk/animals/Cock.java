package ru.milandr.courses.farm.polishchuk.animals;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.polishchuk.goods.Egg;
import ru.milandr.courses.farm.polishchuk.goods.Meat;

public class Cock implements Animal {
    private String name;
    private double weight;
    private String sex;
    private boolean alive = true;

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

    public Cock(String name, double weight, String sex) {
        this.name = name;
        this.weight = weight;
        this.sex = sex;
    }

    public Cock(String name, double weight, String sex, boolean alive) {
        this(name, weight, sex);
        this.alive = alive;
    }

    public Cock() {
        this.name = "";
        this.weight = -1;
        this.sex = "";
    }

    public void produceSound() {
        if (this.sex.compareToIgnoreCase("male") == 0) {
            System.out.println("Nado v cochalochky");
        } else if (this.sex.compareToIgnoreCase("female") == 0) {
            System.out.println("Co-Co-Co");
        } else {
            System.err.println("*sex undefined, no sound produced*");
        }
    }

    public Good produceGoods() {
        double eggWeight = 0.05;

        if (this.sex.compareToIgnoreCase("female") != 0) {
            this.kill();
            return new Meat("Cock", this.weight);
        }
        if (this.alive) {
            if (this.weight > 4. || this.weight > 2.5 && Math.random() > 0.4) {
                this.weight -= eggWeight;
                if (weight < 1.) {
                    this.kill();
                }
                if (Math.random() < 0.2) {
                    return new Egg("black", eggWeight);
                } else {
                    return new Egg("white", eggWeight);
                }
            }
        } else if (this.weight > 0.) {
            return new Meat("Cock", this.weight);
        }
        return null;
    }

    public void feed(double foodWeight) {
        if (foodWeight > 0) {
            this.weight += foodWeight;
            if (this.weight > 10.) {
                this.kill();
            }
        }
    }

    public void kill() {
        this.alive = false;
    }
}