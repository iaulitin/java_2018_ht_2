package ru.milandr.courses.farm.alfyorova.goods;

import ru.milandr.courses.farm.alfyorova.GoodInterface;

public class Good implements GoodInterface {
    private boolean itFresh;
    private int timeOfBeingFresh; //days

    public Good() {
        itFresh = true;
        timeOfBeingFresh = 1;
    }

    public int getTimeOfBeingFresh() {
        return timeOfBeingFresh;
    }

    public void setItFresh(boolean itFresh) {
        this.itFresh = itFresh;
    }

    public void setTimeOfBeingFresh(int timeOfBeingFresh) {
        this.timeOfBeingFresh = timeOfBeingFresh;
    }

    public boolean isItFresh() {
        return itFresh;
    }

    public void goRotten() {
        Thread myThread = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    Thread.sleep(getTimeOfBeingFresh());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                setItFresh(false);
                Thread.yield();
            }
        });
        myThread.start();
    }
}
