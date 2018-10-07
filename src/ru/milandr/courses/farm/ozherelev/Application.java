package ru.milandr.courses.farm.ozherelev;

import ru.milandr.courses.complexnumber.ozherelev.ComplexNumber;
import ru.milandr.courses.complexnumber.ComplexNumberInterface;

import ru.milandr.courses.farm.ozherelev.Farmer;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.GenericFarmer;

import ru.milandr.courses.farm.ozherelev.AnimalGoods;

import ru.milandr.courses.farm.ozherelev.Honey;
import ru.milandr.courses.farm.ozherelev.Egg;
import ru.milandr.courses.farm.ozherelev.Milk;

import ru.milandr.courses.farm.ozherelev.Cow;
import ru.milandr.courses.farm.ozherelev.Bee;
import ru.milandr.courses.farm.ozherelev.Chicken;

public class Application {

    public static void complexNumberTests()
    {
        System.out.println("######################");
        System.out.println("Starting complexnumber tests");
        System.out.println("######################");

        ComplexNumberInterface firstNumber = new ComplexNumber(10.00, 5.00);
        ComplexNumberInterface secondNumber = new ComplexNumber(2.00, 4.00);

        ComplexNumberInterface thirdNumber = firstNumber.add(secondNumber);
        ComplexNumber thirdNum = (ComplexNumber) thirdNumber;

        System.out.println("add test");
        System.out.printf("%f %f \n", thirdNum.getReal(), thirdNum.getImagine());

        ComplexNumberInterface fourthNumber = firstNumber.subtract(secondNumber);
        ComplexNumber forthNumber = (ComplexNumber) fourthNumber;

        System.out.println("substract test");
        System.out.printf("%f %f \n", forthNumber.getReal(), forthNumber.getImagine());

        ComplexNumberInterface fiveNumber = firstNumber.multiply(secondNumber);
        ComplexNumber fiveNumb = (ComplexNumber) fiveNumber;

        System.out.println("multiply test");
        System.out.printf("%f %f\n", fiveNumb.getReal(), fiveNumb.getImagine());

        ComplexNumberInterface sixthNumber = firstNumber.divide(secondNumber);
        ComplexNumber sixthNumb = (ComplexNumber) sixthNumber;

        System.out.println("division test");
        System.out.printf("%f %f\n", sixthNumb.getReal(), sixthNumb.getImagine());

        ComplexNumberInterface seventhNumber = firstNumber.negate();
        ComplexNumber seventhNumb = (ComplexNumber) seventhNumber;

        System.out.println("negate test");
        System.out.printf("%f %f\n", seventhNumb.getReal(), seventhNumb.getImagine());

        double modulus = firstNumber.calculateModulus();
        System.out.println("modulus test");
        System.out.println(modulus);

        double argument = firstNumber.calculateArgument();
        System.out.println("argument test");
        System.out.println(argument);
    }

    public static void farmerTests()
    {
        System.out.println("######################");
        System.out.println("Starting farmer tests!");
        System.out.println("######################");

        Farmer farmer = new Farmer();
        Chicken chicken = new Chicken();
        Cow cow = new Cow();
        Bee bee = new Bee();

        farmer.petAnAnimal(chicken);
        farmer.petAnAnimal(cow);
        farmer.petAnAnimal(bee);

        Good milk = cow.produceGoods();
        Good honey = bee.produceGoods();
        Good egg = chicken.produceGoods();

        egg.goRotten();
        farmer.eatProduct(egg);
        farmer.eatProduct(honey);
        farmer.eatProduct(milk);

        System.out.printf("rottenTime: egg: %f milk: %f honey: %f\n", ((AnimalGoods) egg).getRottenTime(),
                ((AnimalGoods) milk).getRottenTime(), ((AnimalGoods) honey).getRottenTime());


    }

    public static void main(String[] args) {
       //complexNumberTests();
       farmerTests();
    }
}
