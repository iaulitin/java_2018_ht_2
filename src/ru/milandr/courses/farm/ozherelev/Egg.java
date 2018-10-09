package ru.milandr.courses.farm.ozherelev;

public class Egg extends AnimalGoods {
    public Egg()
    {
        this.setRottenTime(1000);
    }

    @Override
    public String toString() {
        return "Egg";
    }
}
