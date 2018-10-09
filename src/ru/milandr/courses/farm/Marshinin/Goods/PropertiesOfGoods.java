package ru.milandr.courses.farm.Marshinin.Goods;

import ru.milandr.courses.farm.Good;

import static java.lang.Thread.sleep;

public class PropertiesOfGoods implements Good {

    private boolean isAlreadyRotten = false;
    private boolean isBecomingRotten = false;
    protected int rottenTime;

    public int getRottenTimeTime() {
        return rottenTime;
    }

    public void setExpireTime(int rottenTime) {
        this.rottenTime = rottenTime;
    }

    public PropertiesOfGoods() {
        goRotten();
    }

    public boolean isRotten() {
        return isAlreadyRotten;
    }

    public void setRotten(boolean rotten) {
        isAlreadyRotten = rotten;
    }

    private Runnable rotteningRun = new Runnable() {
        @Override
        public void run() {
            try {
                sleep(rottenTime);
                isAlreadyRotten = true;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    private Thread rotteningThread = new Thread(rotteningRun);

    @Override
    public void goRotten() {
        if (!isAlreadyRotten && !isBecomingRotten) {
            isBecomingRotten = true;
            rotteningThread.start();
        } else if (isAlreadyRotten)
            System.out.println("It is rotten.");
        else
            System.out.println("It is getting rotten.");
    }
}
