package ru.milandr.courses.complexnumber.dmitrieva;

import ru.milandr.courses.complexnumber.ComplexNumberInterface;

public class ComplexNumber implements ComplexNumberInterface {
    public double real;
    public double imaginary;

    public ComplexNumber(double a) {
        this.real = a;
        this.imaginary = 0;
    }

    public ComplexNumber(double a, double b) {
        this.real = a;
        this.imaginary = b;
    }

    public double getImaginary() {
        return imaginary;
    }

    public double getReal() {
        return real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public void setReal(double real) {
        this.real = real;
    }

    @Override
    public ComplexNumberInterface add(ComplexNumberInterface anotherNumber) {
        if (anotherNumber instanceof ComplexNumber) {
            ComplexNumber anNum = (ComplexNumber) anotherNumber;
            return new ComplexNumber(this.real + anNum.getReal(), this.imaginary + anNum.getImaginary());
        }
        else {
            System.out.println("Invalid number");
            return anotherNumber;
        }
    }

    @Override
    public ComplexNumberInterface subtract(ComplexNumberInterface anotherNumber) {
        if (anotherNumber instanceof ComplexNumber) {
            ComplexNumber anNum = (ComplexNumber) anotherNumber;
            return new ComplexNumber(this.real - anNum.getReal(), this.imaginary - anNum.getImaginary());
        }
        else {
            System.out.println("Invalid number");
            return anotherNumber;
        }
    }

    @Override
    public ComplexNumberInterface multiply(ComplexNumberInterface anotherNumber) {
        if (anotherNumber instanceof ComplexNumber) {
            ComplexNumber anNum = (ComplexNumber) anotherNumber;
            return new ComplexNumber(this.real * anNum.getReal() - this.imaginary * anNum.getImaginary(), this.real * anNum.getImaginary() + this.imaginary * anNum.getReal());
        }
        else {
            System.out.println("Invalid number");
            return anotherNumber;
        }
    }

    @Override
    public ComplexNumberInterface divide(ComplexNumberInterface anotherNumber) {
        if (anotherNumber instanceof ComplexNumber) {
            ComplexNumber anNum = (ComplexNumber) anotherNumber;
            if (anNum.calculateModulus()== 0) {
                System.out.println("Invalid number");
                return anotherNumber;
            }
            else {
                double newReal = (this.getReal() * anNum.getReal() + this.imaginary * anNum.getImaginary()) / anNum.calculateModulus();
                double newImagine = (this.imaginary * anNum.getReal() - this.real * anNum.getImaginary()) / anNum.calculateModulus();
                return new ComplexNumber(newReal, newImagine);
            }
        }
        else {
            System.out.println("Invalid number");
            return anotherNumber;
        }
    }

    @Override
    public ComplexNumberInterface negate() {
        return new ComplexNumber(-this.real, -this.imaginary);
    }

    @Override
    public double calculateModulus() {
        return Math.sqrt(Math.pow(this.real, 2)+Math.pow(this.imaginary, 2));
    }

    @Override
    public double calculateArgument() {
        return Math.atan2(this.imaginary, this.real);
    }
}
