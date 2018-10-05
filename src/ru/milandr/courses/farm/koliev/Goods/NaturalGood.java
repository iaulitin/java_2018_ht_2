package ru.milandr.courses.farm.koliev.Goods;

import ru.milandr.courses.farm.Good;

public class NaturalGood implements Good {
    private long shelfLife;
    private boolean isFresh;

    public long getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(long shelfLife) {
        this.shelfLife = shelfLife;
    }

    public boolean isFresh() {
        return isFresh;
    }

    public void setFresh(boolean fresh) {
        isFresh = fresh;
    }

    public void eatGood() {
        if(isFresh()) {
            System.out.println(this + "is very tasty!!!");
        }else
            System.out.println("Ugh! Faugh!");
    }
    @Override
    public void goRotten() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep( getShelfLife());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                setFresh(false);
                Thread.yield();
            }
        }).start();
    }
}
