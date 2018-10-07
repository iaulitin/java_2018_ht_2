package ru.milandr.courses.complexnumber.kuznetsov;

import ru.milandr.courses.complexnumber.ComplexNumberInterface;

public class ComplexNumber implements ComplexNumberInterface {
    private double re;
    private double im;

    public double getRe() {
        return re;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public double getIm() {
        return im;
    }

    public void setIm(double im) {
        this.im = im;
    }

    public ComplexNumber() {
        this.setRe(0);
        this.setIm(0);
    }

    public ComplexNumber(double a, double b) {
        this.re = a;
        this.im = b;
    }

    @Override
    public ComplexNumberInterface add(ComplexNumberInterface anotherNumber) {
        if (anotherNumber instanceof ComplexNumber) {
            ComplexNumber addend = (ComplexNumber) anotherNumber;
            return new ComplexNumber(addend.re + this.re, addend.im + this.im);
        }
        else {
            System.out.println("Error: unable to cast object type\n");
            return anotherNumber;
        }
    }

    @Override
    public ComplexNumberInterface subtract(ComplexNumberInterface anotherNumber) {
        if (anotherNumber instanceof ComplexNumber) {
            ComplexNumber subtrahend = (ComplexNumber) anotherNumber;
            return new ComplexNumber(this.re - subtrahend.re, this.im - subtrahend.im);
        }
        else {
            System.out.println("Error: unable to cast object type");
            return anotherNumber;
        }
    }

    @Override
    public ComplexNumberInterface multiply(ComplexNumberInterface anotherNumber) {
        if (anotherNumber instanceof ComplexNumber) {
            ComplexNumber multiplier = (ComplexNumber) anotherNumber;
            return new ComplexNumber(this.re * multiplier.re - this.im * multiplier.im,
                    this.im * multiplier.re + this.re * multiplier.im);
        }
        else {
            System.out.println("Error: unable to cast object type");
            return anotherNumber;
        }
    }

    @Override
    public ComplexNumberInterface divide(ComplexNumberInterface anotherNumber) {
        if (anotherNumber instanceof ComplexNumber) {
            ComplexNumber devisor = (ComplexNumber) anotherNumber;
            double a = this.re;
            double b = this.im;
            double c = devisor.re;
            double d = devisor.im;
            if (c * c + d * d != 0)
                return new ComplexNumber((a * c + b * d) / (c * c + d * d), (b * c - a * d) / (c * c + d * d));
            else {
                System.out.println("Error: ");
                return anotherNumber;
            }
        }
        else {
            System.out.println("Computation error: division by zero");
            return anotherNumber;
        }
    }

    @Override
    public ComplexNumberInterface negate() {
        return new ComplexNumber(- this.re, - this.im);
    }

    @Override
    public double calculateModulus() {
        return Math.sqrt(Math.pow(this.re, 2) + Math.pow(this.im, 2));
    }

    @Override
    public double calculateArgument() {
        if (this.re != 0)
            return Math.atan(this.im / this.re);
        else
            return Math.PI / 2;
    }

    public String toString() {
        return String.format("%f + %f i", this.re, this.im);
    }
}
