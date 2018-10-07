package ru.milandr.courses.complexnumber.Marshinin;

import ru.milandr.courses.complexnumber.ComplexNumberInterface;

public class ComplexNumber implements ComplexNumberInterface {
    private double real;
    private double imagine;

    public double getReal() {
        return real;
    }

    public double getImagine() {
        return imagine;
    }

    public double setReal() {
        return this.real;
    }

    public double setImagine() {
        return this.imagine;
    }

    public ComplexNumber(double real, double imagine) {
        this.real = real;
        this.imagine = imagine;
    }

    @Override
    public ComplexNumberInterface add(ComplexNumberInterface anotherNumber) {
        if (anotherNumber instanceof ComplexNumber) {
            ComplexNumber number = (ComplexNumber) anotherNumber;

            return new ComplexNumber(this.real + number.getReal(), this.imagine + number.getImagine());
        } else throw new ClassCastException();
    }

    @Override
    public ComplexNumberInterface subtract(ComplexNumberInterface anotherNumber) {
        if (anotherNumber instanceof ComplexNumber) {
            ComplexNumber number = (ComplexNumber) anotherNumber;

            return new ComplexNumber(this.real - number.getReal(), this.imagine - number.getImagine());
        } else throw new ClassCastException();
    }

    @Override
    public ComplexNumberInterface multiply(ComplexNumberInterface anotherNumber) {
        if (anotherNumber instanceof ComplexNumber) {
            ComplexNumber number = (ComplexNumber) anotherNumber;

            double newReal = this.real * number.getReal() - this.imagine * number.getImagine();
            double newImagine = this.real * number.getImagine() + this.imagine * number.getReal();
            return new ComplexNumber(newReal, newImagine);
        } else throw new ClassCastException();
    }

    @Override
    public ComplexNumberInterface divide(ComplexNumberInterface anotherNumber) {
        if (anotherNumber instanceof ComplexNumber) {
            ComplexNumber number = (ComplexNumber) anotherNumber;

            if (number.getReal() * number.getReal() + number.getImagine() * number.getImagine() != 0) {
                double newReal = (this.real * number.getReal() + this.getImagine() * number.getImagine()) / (Math.pow(number.getReal(), 2.00) + Math.pow(number.getImagine(), 2.00));
                double newImagine = (this.imagine * number.getReal() - this.real * number.getImagine()) / (Math.pow(number.getReal(), 2.00) + Math.pow(number.getImagine(), 2.00));
                return new ComplexNumber(newReal, newImagine);
            } else {
                System.out.println("Dividing by zero is not allowed. Yoyr number will be returned");
                return this;
            }
        } else throw new ClassCastException();
    }

    @Override
    public ComplexNumberInterface negate() {
        return new ComplexNumber(-this.real, -this.imagine);
    }

    @Override
    public double calculateModulus() {
        return Math.sqrt(this.real * this.real + this.imagine * this.imagine);
    }

    @Override
    public double calculateArgument() {
        double argument;
        if (this.real != 0)
            argument = Math.atan(this.imagine / this.real);
        else
            argument = Math.PI / 2;
        return argument;
    }
}
