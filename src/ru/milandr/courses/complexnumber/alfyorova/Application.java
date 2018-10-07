package ru.milandr.courses.complexnumber.alfyorova;

public class Application {
    public static void main(String[] argc) {
        ComplexNumber complexNumber = new ComplexNumber(2, 3);
        ComplexNumber anotherNumber = new ComplexNumber(1, -1);
        System.out.println(complexNumber.toString());

        ComplexNumberInterface resultAdd = complexNumber.add(anotherNumber);
        System.out.println("testAdd: " + resultAdd.toString());

        ComplexNumberInterface resultSub = complexNumber.subtract(anotherNumber);
        System.out.println("testSubtract: " + resultSub.toString());

        ComplexNumberInterface resultMul = complexNumber.multiply(anotherNumber);
        System.out.println("testMultiply: " + resultMul.toString());

        ComplexNumberInterface resultDiv = complexNumber.divide(anotherNumber);
        System.out.println("testDidide: " + resultDiv.toString());

        System.out.printf("testCalculateModulus: %.2f%n", complexNumber.calculateModulus());

        System.out.printf("testCalculateArgument: %.2f%n", complexNumber.calculateArgument());
    }
}
