package ru.milandr.courses.complexnumber.frolov;

import ru.milandr.courses.complexnumber.NewComplexNumberInterface;

public class ComplexNumber implements NewComplexNumberInterface {

    private final double real;
    private final double imagine;

    public ComplexNumber(double a, double b) {
        this.real = a;
        this.imagine = b;
    }


    @Override
    public NewComplexNumberInterface add(NewComplexNumberInterface anotherNumber) {
        ComplexNumber myNumber = checkException(anotherNumber);
        return new ComplexNumber((real + myNumber.real), (imagine + myNumber.imagine));
    }

    @Override
    public NewComplexNumberInterface subtract(NewComplexNumberInterface anotherNumber) {
        ComplexNumber myNumber = checkException(anotherNumber);
        return new ComplexNumber((real - myNumber.real), (imagine - myNumber.imagine));
    }

    @Override
    public NewComplexNumberInterface multiply(NewComplexNumberInterface anotherNumber) {
        ComplexNumber myNumber = checkException(anotherNumber);
        double newReal = (real * myNumber.real - imagine * myNumber.imagine);
        double newImagine = real * myNumber.imagine + imagine * myNumber.real;
        return new ComplexNumber(newReal, newImagine);
    }

    @Override
    public NewComplexNumberInterface divide(NewComplexNumberInterface anotherNumber) {
        ComplexNumber myNumber = checkException(anotherNumber);
        double v = Math.pow(myNumber.real, 2) + Math.pow(myNumber.imagine, 2);
        double newReal = (real * myNumber.real + imagine * myNumber.real) / v;
        double newImagine = (myNumber.real * imagine - real * (myNumber.imagine)) / v;
        return new ComplexNumber(newReal, newImagine);
    }

    @Override
    public ComplexNumber negate() {
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

    @Override
    public double getReal() {
        return real;
    }

    @Override
    public double getImagine() {
        return imagine;
    }

    private ComplexNumber checkException(NewComplexNumberInterface someInstance) {
        if (!(someInstance instanceof ComplexNumber)) {
            throw new ComplexNumberException("Неправильный формат числа");
        }
        return new ComplexNumber(getReal(), getImagine());
    }

    @Override
    public String toString() {
        String signOfImagine = imagine > 0 ? "+" : "-";
        return String.format("z = %.2f %s %.2f i", real, signOfImagine, Math.abs(imagine));
    }

    public static void main(String[] args) {
        NewComplexNumberInterface f1 = new ComplexNumber(5, 14);
        System.out.println(f1);
        NewComplexNumberInterface f2 = new ComplexNumber(10, -6);
        System.out.println(f2);
        NewComplexNumberInterface sum = f1.add(f2);
        System.out.println("сумма: " + sum);
        NewComplexNumberInterface diff = f1.subtract(f2);
        System.out.println("разность: " + diff);
        NewComplexNumberInterface multi = f1.multiply(f2);
        System.out.println("умножение: " + multi);
        NewComplexNumberInterface div = f1.divide(f2);
        System.out.println("деление: " + div);
        NewComplexNumberInterface negative = f1.negate();
        System.out.println("негатив: " + negative);
        double mod = f1.calculateModulus();
        System.out.println("модуль: " + mod);
        double arg = f1.calculateArgument();
        System.out.println("аргумент: " + arg);

        NewComplexNumberInterface f3 = new ComplexNumber(0, -6);
        double arg3 = f3.calculateArgument();
        System.out.println("аргумент чисто мнимого числа: " + arg3);
        NewComplexNumberInterface f4 = new ComplexNumber(10, 0);
        double arg4 = f4.calculateArgument();
        System.out.println("аргумент действительного числа: " + arg4);

        //Попытка передать невалидный аргумент
        f1.add(new Abobus());
    }
}
