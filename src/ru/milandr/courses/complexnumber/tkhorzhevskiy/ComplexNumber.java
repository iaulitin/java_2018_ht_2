package ru.milandr.courses.complexnumber.tkhorzhevskiy;

import ru.milandr.courses.complexnumber.ComplexNumberInterface;

public class ComplexNumber implements ComplexNumberInterface {


    double real;
    double imaginary;



    public ComplexNumber (double x, double y) {
        this.real = x;
        this.imaginary = y;
    }
    @Override
    public String toString() {
        return real + "+" + imaginary + "i";
    }

    public double getReal() {
        return this.real;
    }
    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return this.imaginary;
    }
    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }



    @Override
    public ComplexNumberInterface add(ComplexNumberInterface anotherNumber) {
        return new ComplexNumber((real + ((ComplexNumber) anotherNumber).real), (imaginary + ((ComplexNumber) anotherNumber).imaginary ));
    }

    @Override
    public ComplexNumberInterface subtract(ComplexNumberInterface anotherNumber) {
        return new ComplexNumber((real - ((ComplexNumber) anotherNumber).real), (imaginary - ((ComplexNumber) anotherNumber).imaginary ));
    }

    @Override
    public ComplexNumberInterface multiply(ComplexNumberInterface anotherNumber) {
        double a = real;
        double b = imaginary;
        double c = ((ComplexNumber) anotherNumber).real;
        double d = ((ComplexNumber) anotherNumber).imaginary;

        return new ComplexNumber(a * c - b * d, b * c + a * d);
    }

    @Override
    public ComplexNumberInterface divide(ComplexNumberInterface anotherNumber) {
        double a = real;
        double b = imaginary;
        double c = ((ComplexNumber) anotherNumber).real;
        double d = ((ComplexNumber) anotherNumber).imaginary;
        return new ComplexNumber((a * c + b * d) / (c * c + d * d), (b * c - a * d) / (c * c + d * d));
    }

    @Override
    public ComplexNumberInterface negate() {
        double a = real * -1;
        double b = imaginary * -1;
        return new ComplexNumber(a,b);
    }

    @Override
    public double calculateModulus() {
        return Math.sqrt((real*real + imaginary*imaginary));
    }

    @Override
    public double calculateArgument() {
        return 0;
        //я тупой и не понял этого.
    }
    public static void main(String[] args) {

        ComplexNumber number = new ComplexNumber(2 , 3);
        System.out.println(number + " 1 число");
        ComplexNumber number2 = new ComplexNumber(1 , 2);
        System.out.println(number2 + " 2 число");
        System.out.println(number.add(number2) + " их сумма");
        System.out.println(number.subtract(number2) + " их разность");
        System.out.println(number.divide(number2)+ " результат деления");
        System.out.println(number.multiply(number2)+ " результат перемножения");
        System.out.println(number.negate() + " негатив 1 числа");
        System.out.println(number.calculateModulus() + " модуль 1 числа");

    }

}
