package ru.milandr.courses.complexnumber.perepelitsyn;

public class Application {
    public static void main(String[] args) {
    System.out.println("Проверка");
        ComplexNumber a = new ComplexNumber(1,5);
        ComplexNumber b = new ComplexNumber(3,3);
        a.add(b);
        a.subtract(b);
        a.multiply(b);
        a.divide(b);
        a.negate();
        System.out.println("модуль : \n"+a.calculateModulus());
        System.out.println("аргумент : \n"+a.calculateArgument());

    }
}