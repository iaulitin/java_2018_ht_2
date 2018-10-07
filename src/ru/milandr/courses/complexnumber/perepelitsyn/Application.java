package ru.milandr.courses.complexnumber.perepelitsyn;

import ru.milandr.courses.farm.perepelitsyn.*;

import java.lang.reflect.Array;

public class Application {
    public static void main(String[] args) { //проверка работы

        System.out.printf("\n");
        System.out.printf("Complex numbers checking\n\n");

        ComplexNumbers base = new ComplexNumbers(2,5);
        ComplexNumbers another = new ComplexNumbers(3,3);
        base.add(another);
        base.subtract(another);
        base.multiply(another);
        base.divide(another);
        base.negate();
        base.calculateModulus();
        base.calculateArgument();

        System.out.printf("\n");
        System.out.printf("Farm work checking\n\n");

        GenericFarmer farmer = new GenericFarmer();
        Eggs eggs = new Eggs();
        Wool wool = new Wool();
        Milk milk = new Milk();
        farmer.collectGoods(eggs);
        farmer.collectGoods(wool);
        farmer.collectGoods(milk);


        Cow cow = new Cow();
        farmer.petAnAnimal(cow);

        Chicken chicken = new Chicken();
        farmer.petAnAnimal(chicken);

        Sheep sheep = new Sheep();
        farmer.petAnAnimal(sheep);

        farmer.eatProduct(eggs);
        farmer.eatProduct(wool);
        farmer.eatProduct(milk);

    }
}
