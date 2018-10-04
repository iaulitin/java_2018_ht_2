package ru.milandr.courses.farm.sitnikov.goods;

import ru.milandr.courses.farm.Good;

public abstract class SimpleGood implements Good {

    /**
     * Indicates that good is rotten.
     */
    private boolean isRotten = false;

    /**
     * Indicates that good is going rotten.
     */
    private boolean isGoingRotten = false;

    /**
     * Time to get good rotten.
     */
    private int rottenTime = 5;

    public boolean isRotten() {
        return isRotten;
    }

    public void setRotten(boolean rotten) {
        isRotten = rotten;
    }

    public boolean isGoingRotten() {
        return isGoingRotten;
    }

    public void setGoingRotten(boolean goingRotten) {
        isGoingRotten = goingRotten;
    }

    public int getRottenTime() {
        return rottenTime;
    }

    public void setRottenTime(int rottenTime) {
        this.rottenTime = rottenTime;
    }

    @Override
    public void goRotten() {
        if (this.isGoingRotten || this.isRotten)
            return;
        new Thread(() -> {
            try {
                Thread.sleep(SimpleGood.this.getRottenTime() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            SimpleGood.this.setRotten(true);
            SimpleGood.this.setGoingRotten(false);
        }).start();
    }
}
