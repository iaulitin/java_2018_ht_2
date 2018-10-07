package ru.milandr.courses.farm.vorobyev.good;

import ru.milandr.courses.farm.Good;

import static java.lang.Thread.sleep;

public class BasicGood implements Good {
    private boolean isRotten = false;
    private boolean empty = false;
    protected int expireTime;
    private boolean rottenFlag = false;

    public BasicGood() {
        goRotten();
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public boolean isRotten() {
        return isRotten;
    }

    public void setRotten(boolean rotten) {
        isRotten = rotten;
    }

    public int getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(int expireTime) {
        this.expireTime = expireTime;
    }


    private Runnable rotteningRun = new Runnable() {
        @Override
        public void run() {
            try {
                sleep(expireTime);
                isRotten = true;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    };

    private Thread rotteningThread = new Thread(rotteningRun);

    @Override
    public void goRotten() {
        if (!isRotten && !rottenFlag) {
            rottenFlag = true;
            rotteningThread.start();
        }
        else if(isRotten)
            System.out.println("Good is already spoiled");
        else
            System.out.println("Good already started spoiling");

    }
}



