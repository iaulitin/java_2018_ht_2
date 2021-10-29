package ru.milandr.courses.farm.frolov.goods;

import ru.milandr.courses.farm.frolov.FarmerAbobus;

public class Meat extends SuperGood {
    private static final long MEAT_EXTENDED_TIME_MS = 7500;

    public Meat() {
        extendedTime = MEAT_EXTENDED_TIME_MS;
    }

    @Override
    public void getCollected(FarmerAbobus farmer) {
        System.out.println(farmer.getName() + " заколол порося");
    }

    @Override
    public String toString() {
        return "мясо";
    }
}