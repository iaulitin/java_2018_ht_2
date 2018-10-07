package ru.milandr.courses.farm.rasskazov.goods;

import ru.milandr.courses.farm.Good;

public class Info implements Good {
    private long shelfLife;
    public static boolean freshness;

    public void setShelfLife(long shelfLife) {
        this.shelfLife = shelfLife;
    }

    public void setFreshness(boolean freshness) {
        this.freshness = freshness;
    }

    @Override
    public void goRotten() {
        this.freshness = false;
    }
}
