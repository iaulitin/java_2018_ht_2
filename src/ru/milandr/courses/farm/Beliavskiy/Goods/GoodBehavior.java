package ru.milandr.courses.farm.Beliavskiy.Goods;

import ru.milandr.courses.farm.Good;

public abstract class GoodBehavior implements Good {

    private boolean  Rotten = false;

    private boolean Rot = false;

    private int RotTime = 1;

    public boolean Rotten() {
        return Rotten;
    }

    public void setRotten(boolean rotten) {
        Rotten = rotten;
    }


    public void setRot(boolean goingRotten) {
        Rot = goingRotten;
    }

    public int getRotTime() {
        return RotTime;
    }

    public void setRotTime(int rottenTime) {
        this.RotTime = rottenTime;
    }

    @Override
    public void goRotten() {
        if (this.Rot || this.Rotten)
            return;
        new Thread(() -> {
            try {
                Thread.sleep(GoodBehavior.this.getRotTime() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            GoodBehavior.this.setRotten(true);
            GoodBehavior.this.setRot(false);
        }).start();
    }
}



