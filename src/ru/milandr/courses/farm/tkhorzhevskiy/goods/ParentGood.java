package ru.milandr.courses.farm.tkhorzhevskiy.goods;

import ru.milandr.courses.farm.Good;

public class ParentGood implements Good {
    protected boolean isRotten;
    protected String name;

    public ParentGood(){
        this.isRotten=false;
    }

    public boolean isRotten() {
        return isRotten;
    }

    public void setRotten(boolean rotten) {
        isRotten = rotten;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void goRotten() {
        isRotten = true;

    }
    public String toString() {
        return this.getName();
    }


}
