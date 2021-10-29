package ru.milandr.courses.farm.frolov.goods;

import ru.milandr.courses.farm.frolov.FarmerAbobus;

public class Milk extends SuperGood {
    private static final long MILK_EXTENDED_TIME_MS = 5000;

    public Milk() {
        extendedTime = MILK_EXTENDED_TIME_MS;
    }

    @Override
    public void getCollected(FarmerAbobus farmer) {
        System.out.println(farmer.getName() + " подоил корову");
    }

    @Override
    public String toString() {
        return "молоко";
    }
}
