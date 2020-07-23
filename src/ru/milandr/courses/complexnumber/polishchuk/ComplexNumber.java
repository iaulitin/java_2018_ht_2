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
        ComplexNumber numberToAdd = (ComplexNumber) anotherNumber;
        ComplexNumber result = new ComplexNumber();

        result.re = this.re + numberToAdd.re;
        result.im = this.im + numberToAdd.im;
        return result;
    }

    public ComplexNumberInterface subtract(ComplexNumberInterface anotherNumber) {
        if (!(anotherNumber instanceof ComplexNumber))
            return null;
        ComplexNumber numberToSub = (ComplexNumber) anotherNumber;
        ComplexNumber result = new ComplexNumber();

        result.re = this.re - numberToSub.re;
        result.im = this.re - numberToSub.im;
        return result;
    }

    public ComplexNumberInterface multiply(ComplexNumberInterface anotherNumber) {
        if (!(anotherNumber instanceof ComplexNumber))
            return null;
        ComplexNumber numberToMul = (ComplexNumber) anotherNumber;
        ComplexNumber result = new ComplexNumber();

        result.re = this.re * numberToMul.re - this.im * numberToMul.im;
        result.im = this.re * numberToMul.im + this.im * numberToMul.re;
        return result;
    }

    public ComplexNumberInterface divide(ComplexNumberInterface anotherNumber) {
        if (!(anotherNumber instanceof ComplexNumber))
            return null;
        ComplexNumber numberToDiv = (ComplexNumber) anotherNumber;
        ComplexNumber result = new ComplexNumber();
        double denominator;

        denominator = Math.pow(numberToDiv.re, 2) + Math.pow(numberToDiv.im, 2);
        result.re = (this.re * numberToDiv.re + this.im * numberToDiv.im) / denominator;
        result.im = (this.im * numberToDiv.re - this.re * numberToDiv.im) / denominator;
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
