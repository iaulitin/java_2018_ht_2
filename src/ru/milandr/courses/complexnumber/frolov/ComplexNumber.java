package ru.milandr.courses.complexnumber.frolov;

import ru.milandr.courses.complexnumber.ComplexNumberInterface;

public class ComplexNumber implements ComplexNumberInterface {

    private final double real;
    private final double imagine;

    public ComplexNumber(double a, double b) {
        this.real = a;
        this.imagine = b;
    }

    @Override
    public ComplexNumberInterface add(ComplexNumberInterface anotherNumber) {
        ComplexNumber myNumber = checkInstance(anotherNumber);
        return new ComplexNumber((real + myNumber.real), (imagine + myNumber.imagine));
    }

    @Override
    public ComplexNumberInterface subtract(ComplexNumberInterface anotherNumber) {
        ComplexNumber myNumber = checkInstance(anotherNumber);
        return new ComplexNumber((real - myNumber.real), (imagine - myNumber.imagine));
    }

    @Override
    public ComplexNumberInterface multiply(ComplexNumberInterface anotherNumber) {
        ComplexNumber myNumber = checkInstance(anotherNumber);
        double newReal = (real * myNumber.real - imagine * myNumber.imagine);
        double newImagine = real * myNumber.imagine + imagine * myNumber.real;
        return new ComplexNumber(newReal, newImagine);
    }

    @Override
    public ComplexNumberInterface divide(ComplexNumberInterface anotherNumber) {
        ComplexNumber myNumber = checkInstance(anotherNumber);
        double v = Math.pow(myNumber.real, 2) + Math.pow(myNumber.imagine, 2);
        double newReal = (real * myNumber.real + imagine * myNumber.real) / v;
        double newImagine = (myNumber.real * imagine - real * (myNumber.imagine)) / v;
        return new ComplexNumber(newReal, newImagine);
    }

    @Override
    public ComplexNumberInterface negate() {
        double newReal = real * -1;
        double newImagine = imagine * -1;
        return new ComplexNumber(newReal, newImagine);
    }

    @Override
    public double calculateModulus() {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imagine, 2));
    }

    @Override
    public double calculateArgument() {
        if (imagine == 0 & real > 0) {
            return Math.toRadians(0);
        }

        if (imagine == 0 & real < 0) {
            return Math.toRadians(180);
        }

        if (real == 0 & imagine > 0) {
            return Math.toRadians(90);
        }

        if (real == 0 & imagine < 0) {
            return Math.toRadians(270);
        }

        return real >= 0 ? Math.atan(imagine / real) : Math.atan(imagine / real + Math.toRadians(90));
    }

    private ComplexNumber checkInstance(ComplexNumberInterface someInstance) {
        return (ComplexNumber) someInstance;
    }

    @Override
    public String toString() {
        String signOfImagine = imagine > 0 ? "+" : "-";
        return String.format("z = %.2f %s %.2f i", real, signOfImagine, Math.abs(imagine));
    }

    public static void main(String[] args) {
        ComplexNumberInterface f1 = new ComplexNumber(5, 14);
        System.out.println(f1);
        ComplexNumberInterface f2 = new ComplexNumber(10, -6);
        System.out.println(f2);
        ComplexNumberInterface sum = f1.add(f2);
        System.out.println("сумма: " + sum);
        ComplexNumberInterface diff = f1.subtract(f2);
        System.out.println("разность: " + diff);
        ComplexNumberInterface multi = f1.multiply(f2);
        System.out.println("умножение: " + multi);
        ComplexNumberInterface div = f1.divide(f2);
        System.out.println("деление: " + div);
        ComplexNumberInterface negative = f1.negate();
        System.out.println("негатив: " + negative);
        double mod = f1.calculateModulus();
        System.out.println("модуль: " + mod);
        double arg = f1.calculateArgument();
        System.out.println("аргумент: " + arg);

        ComplexNumberInterface f3 = new ComplexNumber(0, -6);
        double arg3 = f3.calculateArgument();
        System.out.println("аргумент чисто мнимого числа: " + arg3);
        ComplexNumberInterface f4 = new ComplexNumber(10, 0);
        double arg4 = f4.calculateArgument();
        System.out.println("аргумент действительного числа: " + arg4);
    }
}
