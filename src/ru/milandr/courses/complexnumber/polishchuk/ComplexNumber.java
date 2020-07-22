package ru.milandr.courses.complexnumber.polishchuk;

import ru.milandr.courses.complexnumber.ComplexNumberInterface;

public class ComplexNumber implements ComplexNumberInterface {
    public double re;
    public double im;

    public ComplexNumber() {
        this.re = 0.;
        this.im = 0.;
    }

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public ComplexNumber(ComplexNumber number) {
        this.re = number.re;
        this.im = number.im;
    }


    public ComplexNumberInterface add(ComplexNumberInterface anotherNumber) {
        if (!(anotherNumber instanceof ComplexNumber))
            return null;
        ComplexNumber result = new ComplexNumber(this);

        result.re += ((ComplexNumber) anotherNumber).re;
        result.im += ((ComplexNumber) anotherNumber).im;
        return result;
    }

    public ComplexNumberInterface subtract(ComplexNumberInterface anotherNumber) {
        if (!(anotherNumber instanceof ComplexNumber))
            return null;
        ComplexNumber result = new ComplexNumber(this);

        result.re -= ((ComplexNumber) anotherNumber).re;
        result.im -= ((ComplexNumber) anotherNumber).im;
        return result;
    }

    public ComplexNumberInterface multiply(ComplexNumberInterface anotherNumber) {
        if (!(anotherNumber instanceof ComplexNumber))
            return null;
        ComplexNumber result = new ComplexNumber();

        result.re = this.re * ((ComplexNumber) anotherNumber).re - this.im * ((ComplexNumber) anotherNumber).im;
        result.im = this.re * ((ComplexNumber) anotherNumber).im + this.im * ((ComplexNumber) anotherNumber).re;
        return result;
    }

    public ComplexNumberInterface divide(ComplexNumberInterface anotherNumber) {
        if (!(anotherNumber instanceof ComplexNumber))
            return null;
        ComplexNumber result = new ComplexNumber();
        double denominator;

        denominator = Math.pow(((ComplexNumber) anotherNumber).re, 2) + Math.pow(((ComplexNumber) anotherNumber).im, 2);
        result.re = (this.re * ((ComplexNumber) anotherNumber).re + this.im * ((ComplexNumber) anotherNumber).im) / denominator;
        result.im = (this.im * ((ComplexNumber) anotherNumber).re - this.re * ((ComplexNumber) anotherNumber).im) / denominator;
        return result;
    }

    public ComplexNumberInterface negate() {
        return new ComplexNumber(-this.re, -this.im);
    }

    public double calculateModulus() {
        return Math.sqrt(Math.pow(this.re, 2) + Math.pow(this.im, 2));
    }

    public double calculateArgument() {
        if (this.re > 0.)
            return Math.atan(this.im / this.re);
        else if (this.re < 0. && this.im >= 0.)
            return Math.atan(this.im / this.re) + Math.PI;
        else if (this.re < 0. && this.im < 0.)
            return Math.atan(this.im / this.re) - Math.PI;
        else if (this.re == 0. && this.im > 0.)
            return Math.PI / 2.;
        else if (this.re == 0. && this.im < 0.)
            return -Math.PI / 2.;
        else
            return Double.NaN;
    }

    public void print() {
        System.out.format("(%f%+fi)", this.re, this.im);
    }
}
