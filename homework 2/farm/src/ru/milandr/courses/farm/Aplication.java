package ru.milandr.courses.farm;

public class Aplication {
    public static  void main(String[] argc){
        GenericFarmers farmer = new GenericFarmers();
        Eggs eggs = new Eggs();
        Meat wool = new Meat();
        Milk milk = new Milk();

        farmer.collectGoods(eggs);
        farmer.collectGoods(wool);
        farmer.collectGoods(milk);

        Cow cow = new Cow();
        farmer.petAnimal(cow);
        Chicken chicken = new Chicken();
        farmer.petAnimal(chicken);
        Pig pig = new Pig();
        farmer.petAnimal(pig);

        farmer.eatProduct(eggs);
        farmer.eatProduct(wool);
        farmer.eatProduct(milk);

    }
}
