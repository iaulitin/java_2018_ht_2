package ru.milandr.courses.farm.alfyorova.goods;

import ru.milandr.courses.farm.alfyorova.GoodInterface;

public class Good implements GoodInterface {
    private String goodName;
    private boolean itFresh;
    private int timeOfBeingFresh; //days

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getGoodName() {
        return goodName;
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

    public void eatGood() {
        if (itFresh) {
            System.out.println("Great " + this.goodName);
        } else {
            System.out.println(this.goodName + " is spoilt");
        }
    }

    public void goRotten() {
        new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    Thread.sleep( getTimeOfBeingFresh());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                setItFresh(false);
                Thread.yield();
            }
        }).start();
    }
}
