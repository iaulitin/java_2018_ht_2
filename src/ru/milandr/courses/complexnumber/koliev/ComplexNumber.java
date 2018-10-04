package ru.milandr.courses.complexnumber.koliev;

import ru.milandr.courses.complexnumber.ComplexNumberInterface;

public class ComplexNumber implements ComplexNumberInterface {
    private double real;
    private double imaginary;

    public ComplexNumber() {
        this.real = 0;
        this.imaginary = 0;
    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    @Override
    public ComplexNumberInterface add(ComplexNumberInterface anotherNumber) {
        return new ComplexNumber(this.getReal() + ((ComplexNumber)anotherNumber).getReal(),
                this.getImaginary() + ((ComplexNumber)anotherNumber).getImaginary());
    }

    @Override
    public ComplexNumberInterface subtract(ComplexNumberInterface anotherNumber) {
        return new ComplexNumber(this.getReal() - ((ComplexNumber)anotherNumber).getReal(),
                this.getImaginary() - ((ComplexNumber)anotherNumber).getImaginary());
    }

    @Override
    public ComplexNumberInterface multiply(ComplexNumberInterface anotherNumber) {
        ComplexNumber complexNumber = (ComplexNumber) anotherNumber;
        double resRe = this.getReal() * complexNumber.getReal()
                - this.getImaginary() * complexNumber.getImaginary();
        double resIm = this.getImaginary() * complexNumber.getReal()
                + this.getReal() * complexNumber.getImaginary();
        return new ComplexNumber(resRe, resIm);
    }

    @Override
    public ComplexNumberInterface divide(ComplexNumberInterface anotherNumber) {
        ComplexNumber complexNumber = (ComplexNumber) anotherNumber;
        double resRe = this.getReal() * complexNumber.getReal()
                + this.getImaginary() * complexNumber.getImaginary();
        double resIm = this.getImaginary() * complexNumber.getReal()
                - this.getReal() * complexNumber.getImaginary();
        double res = complexNumber.getReal() * complexNumber.getReal()
                + complexNumber.getImaginary() * complexNumber.getImaginary();
        return new ComplexNumber(resRe/res, resIm/res);    }

    @Override
    public ComplexNumberInterface negate() {
        return new ComplexNumber(0 - getReal(),  0 - getImaginary());
    }

    @Override
    public double calculateModulus() {
        return Math.sqrt(this.getReal() * this.getReal() +
                      this.getImaginary() * this.getImaginary());
    }

    @Override
    public double calculateArgument() {
        return Math.atan2(this.getImaginary(), this.getReal());
    }
}
