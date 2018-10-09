package ru.milandr.courses.farm.ozherelev;

import ru.milandr.courses.farm.Good;

class Threading implements Runnable
{
    private AnimalGoods goods;

    public void setGoods(AnimalGoods goods) {
        this.goods = goods;
    }

    public AnimalGoods getGoods() {
        return goods;
    }

    @Override
    public void run() {
        try{
            Thread.sleep((long)goods.getRottenTime());
        } catch (InterruptedException error){
            error.printStackTrace();
        }

        goods.setRotten(true);
    }
}

public class AnimalGoods implements Good
{
    private boolean isRotten;
    private long rottenTime;
    static Threading thread;


    public void setRotten(boolean rotten) {
        this.isRotten = rotten;
    }

    public void setRottenTime(long rottenTime) {
        this.rottenTime = rottenTime;
    }

    public double getRottenTime() {
        return this.rottenTime;
    }

    public boolean isRotten() {
        return this.isRotten;
    }

    @Override
    public void goRotten() {
        thread = new Threading();
        thread.setGoods(this);
        Thread newThread = new Thread(thread);
        newThread.run();
    }
}
