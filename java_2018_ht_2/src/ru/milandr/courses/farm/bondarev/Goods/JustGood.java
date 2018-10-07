package ru.milandr.courses.farm.bondarev.Goods;

import ru.milandr.courses.farm.Good;

public class JustGood implements Good {

    private long BestBefore;
    private boolean Fresh;

    public boolean Fresh() {
        return Fresh;
    }

    public long getBestBefore() {
        return BestBefore;
    }

    public void setBestBefore(long bestBefore) {
        this.BestBefore = bestBefore;
    }

    public void setFresh(boolean fresh) {
        Fresh = fresh;
    }


    public void eatGood() {
        if ( Fresh() ) {
            System.out.println(this + " tastes good)))");
        } else
            System.out.println("Damn it!! " + this + " is old af!");
    }


    @Override
    public void goRotten() {
        new Thread( new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep( getBestBefore() );
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                setFresh(false);
                Thread.yield();
            }
        }) .start();
    }
}
