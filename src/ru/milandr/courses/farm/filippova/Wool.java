package ru.milandr.courses.farm.filippova;

import ru.milandr.courses.farm.Good;

import static java.lang.Thread.sleep;

public class Wool implements Good {


    public static int freshPeriod = 5000;
    private boolean isRotten;
    private boolean isTasted;


    Wool(boolean r, boolean t, int p) {
        this.isRotten = r;
        this.isTasted = t;
        Wool.freshPeriod = p;
    }

    @Override
    public String toString() {
        return "wool";
    }

    public boolean isRotten() {
        return this.isRotten;
    }

    public void setRotten(boolean rotten) {
        this.isRotten = rotten;
    }

    public boolean isTasted() {
        return this.isTasted;
    }

    public void setTasted(boolean tasted) {
        this.isTasted = tasted;
    }


    @Override
    public void goRotten() {
        if (!this.isRotten){
            Thread myThready = new Thread(new Runnable() {
                public void run() //Этот метод будет выполняться в побочном потоке
                {
                    try {
                        sleep(5000);
                        Wool.this.setRotten(true);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Wool.this.setRotten(true);

                    System.out.println("Wool is rotten now!");

                }
            });
            myThready.start();

            if (this.isTasted) {

                System.out.println("this wool was already tasted, let's try another");
            } else {
                System.out.println("Let's taste this wool!");

            }
        }

    }
}