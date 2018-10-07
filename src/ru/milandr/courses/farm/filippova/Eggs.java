package ru.milandr.courses.farm.filippova;

import ru.milandr.courses.farm.Good;

import static java.lang.Thread.sleep;

public class Eggs implements Good {
    private static int freshPeriod = 3000;
    private boolean isRotten;
    private boolean isTasted;

    Eggs(boolean r, boolean t, int p) {
        this.isRotten = r;
        this.isTasted = t;
        Eggs.freshPeriod = p;
    }

    @Override
    public String toString() {
        return "eggs";
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
        if (!this.isRotten) {
            Thread myThready = new Thread(new Runnable() {
                public void run() //Этот метод будет выполняться в побочном потоке
                {
                    try {
                        sleep(3000);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Eggs.this.setRotten(true);
                    System.out.println("Eggs are rotten now!");
                }
            });
            myThready.start();


            if (this.isTasted) {
                System.out.println("this milk was already tasted, let's try another");
            } else {
                System.out.println("Let's taste the eggs!");
            }

        }
    }
}
