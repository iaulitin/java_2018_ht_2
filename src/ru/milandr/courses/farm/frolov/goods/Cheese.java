package ru.milandr.courses.farm.frolov.goods;

import ru.milandr.courses.farm.frolov.FarmerAbobus;

public class Cheese extends SuperGood {
    private static final long CHEESE_EXTENDED_TIME_MS = 10000;
    public static final String CHEESE_NAME = "сыр";

    public Cheese() {
        extendedTime = CHEESE_EXTENDED_TIME_MS;
    }

    @Override
    public void getCollected(FarmerAbobus farmer) {
        System.out.println(farmer.getName() + " сварил сыр");
    }

    @Override
    public String toString() {
        return CHEESE_NAME;
    }
}