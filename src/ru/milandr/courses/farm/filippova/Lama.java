package ru.milandr.courses.farm.filippova;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;

public class Lama implements Animal {
    private String color;
    private int mass;
    private boolean feed;

    Lama(String s, int m, boolean f) {
        color = s;
        mass = m;
        feed = f;
    }


    public static void needFeed(Lama lama) throws InterruptedException {
        if (!lama.feed) {
            System.out.println("Okey, lama was fed");
            lama.mass = lama.mass + 1;
            lama.feed = true;

        } else {
            System.out.println("Lama is not hungry");
        }

    }

    public boolean isFeed() {
        return this.feed;
    }

    public void setFeed(boolean feed) {
        this.feed = feed;
    }

    public int getMass() {
        return this.mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void produceSound() {
        System.out.println("Meee");

    }
    @Override
    public Good produceGoods() {
        Good wool = new Wool(false, false, 5000);


        return wool;
    }
}
