package ru.milandr.courses.complexnumber.rasskazov;

import ru.milandr.courses.complexnumber.ComplexNumberInterface;

public class ComplexNumber implements ComplexNumberInterface {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    @Override
    public ComplexNumberInterface add(ComplexNumberInterface anotherNumber) {
        return new ComplexNumber(this.real + ((ComplexNumber)anotherNumber).getReal(), this.imaginary + ((ComplexNumber)anotherNumber).getImaginary());
    }

    @Override
    public ComplexNumberInterface subtract(ComplexNumberInterface anotherNumber) {
        return new ComplexNumber(this.real - ((ComplexNumber)anotherNumber).getReal(), this.imaginary - ((ComplexNumber)anotherNumber).getImaginary());
    }
    @Override
    public ComplexNumberInterface multiply(ComplexNumberInterface anotherNumber) {
        return new ComplexNumber(this.real * ((ComplexNumber)anotherNumber).getReal() - this.imaginary - ((ComplexNumber)anotherNumber).getImaginary(), this.real * ((ComplexNumber)anotherNumber).getImaginary() + this.imaginary * ((ComplexNumber)anotherNumber).getReal());
    }

    @Override
    public ComplexNumberInterface divide(ComplexNumberInterface anotherNumber) {
        if (anotherNumber.calculateModulus() == 0){
            System.out.print("Division is impossible, the following number can't be divided by ");
            return anotherNumber;
        }
        else {
            return new ComplexNumber((this.real * ((ComplexNumber)anotherNumber).getReal() + this.imaginary * ((ComplexNumber)anotherNumber).getImaginary()) / (anotherNumber.calculateModulus()), (((ComplexNumber)anotherNumber).getReal() * this.imaginary - this.real * ((ComplexNumber)anotherNumber).getImaginary()) / (anotherNumber.calculateModulus()));
        }
    }

    @Override
    public ComplexNumberInterface negate() {
        return new ComplexNumber(-(this.real), -(this.imaginary));
    }

    @Override
    public double calculateModulus() {
        return Math.sqrt(Math.pow(this.getReal(),2) + Math.pow(this.getImaginary(),2));
    }

    @Override
    public double calculateArgument() {
        return Math.atan(this.imaginary / this.real);
    }
}
