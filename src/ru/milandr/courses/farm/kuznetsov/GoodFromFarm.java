package ru.milandr.courses.farm.kuznetsov;

import ru.milandr.courses.farm.Good;

public class GoodFromFarm implements Good {
    private int timeBeingFresh;
    private boolean isRotten;

    public int getTimeBeingFresh() {
        return this.timeBeingFresh;
    }

    public void setTimeBeingFresh(int timeBeingFresh) {
        this.timeBeingFresh = timeBeingFresh;
    }

    public boolean isRotten() {
        return this.isRotten;
    }

    public void setRotten(boolean rotten) {
        isRotten = rotten;
    }

    @Override
    public void goRotten() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(getTimeBeingFresh());
                } catch (InterruptedException error) {
                    error.printStackTrace();
                }
                setRotten(true);
            }
        });
        thread.start();
    }
}
