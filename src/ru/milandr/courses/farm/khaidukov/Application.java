package ru.milandr.courses.farm.khaidukov

public class Application {
    public static void main (String[] args){
        Farmer jimbo = new Farmer();
        Cow elza = new Cow ();
        Sheep martha = new Sheep();
        Chicken bella = new Chicken();
        jimbo.petAnAnimal(elza);
        jimbo.petAnAnimal(martha);
        jimbo.petAnAnimal(bella);
        Good milk = elza.produceGoods();
        Good wool = martha.produceGoods();
        Good egg = bella.produceGoods();
        jimbo.collectGoods(milk);
        jimbo.collectGoods(wool);
        jimbo.collectGoods(egg);
        jimbo.eatProduct(milk);
        jimbo.eatProduct(wool);
        jimbo.eatProduct(egg);
    }
}
