package ru.milandr.courses.farm.filippova;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;

public class Chicken implements Animal {
    private String breed;
    private int speed;

    Chicken(String b, int s) {
        breed = b;
        speed = s;
    }

    public static void warning(Chicken chicken) {
        if (chicken.speed >= 5) {
            System.out.println("Attention, chicken run!");
        }
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void produceSound() {
        System.out.println("KoKoKo");

    }

    @Override
    public Good produceGoods() {
        Good eggs = new Eggs(false, false, 3000);
        return (eggs);
    }
}
