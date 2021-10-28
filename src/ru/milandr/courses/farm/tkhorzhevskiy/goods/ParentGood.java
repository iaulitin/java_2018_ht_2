package ru.milandr.courses.farm.tkhorzhevskiy.goods;

import ru.milandr.courses.farm.Good;

public class ParentGood implements Good {
    long currTime;
    private boolean isRotten = false;
    private long rotTime;
    private long gatherTime;
    private String name;

    public boolean isRotten(boolean b) {
        return isRotten;
    }

    public void setRotten(boolean rotten) {
        isRotten = rotten;
    }

    public long getRotTime() {
        return rotTime;
    }

    public void setRotTime(int rotTime) {
        this.rotTime = rotTime;
    }

    public long getGatherTime() {
        return gatherTime;
    }

    public void setGatherTime(long gatherTime) {
        this.gatherTime = gatherTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCurrTime() {
        return currTime;
    }

    public void setCurrTime(long currTime) {
        this.currTime = currTime;
    }

    @Override
    public void goRotten() {
        isRotten = true;

    }


}
