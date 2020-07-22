package ru.milandr.courses.farm.polishchuk.animals;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.polishchuk.goods.Meat;
import ru.milandr.courses.farm.polishchuk.goods.Milk;

public class Cow implements Animal {
    private String name;
    private double weight;
    private String sex;
    private boolean alive;

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

    public Cow(String name, double weight, String sex, boolean alive) {
        this.name = name;
        this.weight = weight;
        this.sex = sex;
        this.alive = alive;
    }

    public Cow(String name, double weight, String sex) {
        this(name, weight, sex, true);
    }

    public Cow() {
        this.name = "";
        this.weight = -1;
        this.alive = true;
        this.sex = "";
    }

    public void produceSound() {
        if (!this.alive) {
            System.err.println("*dead, no sound produced*");
        } else {
            System.out.println("Moo");
        }
    }

    public Good produceGoods() {
        double milkVolume = 5.;

        if (this.sex.compareToIgnoreCase("female") != 0 && this.alive) {
            this.kill();
        }
        if (!this.alive) {
            if (this.weight > 0.) {
                Meat meat = new Meat("Cow", this.weight);
                this.weight = 0.;
                return meat;
            }
            return null;
        } else {
            if (this.weight > 400. || Math.random() >= 0.3) {
                this.weight -= milkVolume;
                if (this.weight < 200.) {
                    this.kill();
                }
                return new Milk(milkVolume);
            }
        }
        return null;
    }

    public void feed(double foodWeight) {
        if (!this.alive)
            return;
        if (foodWeight > 0) {
            this.weight += foodWeight;
            if (this.weight > 1000.) {
                this.kill();
            }
        }
    }

    public void kill() {
        this.alive = false;
    }
}