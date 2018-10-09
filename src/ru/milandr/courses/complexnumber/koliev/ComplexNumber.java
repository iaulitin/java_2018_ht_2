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
        if(anotherNumber instanceof ComplexNumber)
        return new ComplexNumber(this.real + ((ComplexNumber)anotherNumber).getReal(),
                this.imaginary + ((ComplexNumber)anotherNumber).getImaginary());
        else
            System.out.println("This class isn't lead to ComplexNumber");
        return this;
    }

    @Override
    public ComplexNumberInterface subtract(ComplexNumberInterface anotherNumber) {
        if(anotherNumber instanceof ComplexNumber)
            return new ComplexNumber(this.real - ((ComplexNumber)anotherNumber).getReal(),
                this.imaginary - ((ComplexNumber)anotherNumber).getImaginary());
        else
            System.out.println("This class isn't lead to ComplexNumber");
        return this;
    }

    @Override
    public ComplexNumberInterface multiply(ComplexNumberInterface anotherNumber) {
        if(anotherNumber instanceof ComplexNumber) {
            ComplexNumber complexNumber = (ComplexNumber) anotherNumber;
            double resRe = this.real * complexNumber.getReal()
                    - this.imaginary * complexNumber.getImaginary();
            double resIm = this.imaginary * complexNumber.getReal()
                    + this.real * complexNumber.getImaginary();
            return new ComplexNumber(resRe, resIm);
        }
        else
            System.out.println("This class isn't lead to ComplexNumber");
        return this;
    }

    @Override
    public ComplexNumberInterface divide(ComplexNumberInterface anotherNumber) {
        if (anotherNumber instanceof ComplexNumber) {
            ComplexNumber complexNumber = (ComplexNumber) anotherNumber;
            double resRe = this.real * complexNumber.getReal()
                    + this.imaginary * complexNumber.getImaginary();
            double resIm = this.imaginary * complexNumber.getReal()
                    - this.real * complexNumber.getImaginary();
            double res = complexNumber.getReal() * complexNumber.getReal()
                    + complexNumber.getImaginary() * complexNumber.getImaginary();
            if (res == 0)
                return new ComplexNumber(resRe > 0 ?
                        Double.POSITIVE_INFINITY : Double.NEGATIVE_INFINITY,
                        resIm > 0 ? Double.POSITIVE_INFINITY : Double.NEGATIVE_INFINITY);
            return new ComplexNumber(resRe / res, resIm / res);
        }
        else
            System.out.println("This class isn't lead to ComplexNumber");
        return this;
    }

    @Override
    public ComplexNumberInterface negate() {
        return new ComplexNumber( -this.real,  -this.imaginary);
    }

    @Override
    public double calculateModulus() {
        return Math.sqrt(this.real * this.real +
                      this.imaginary * this.imaginary);
    }

    @Override
    public double calculateArgument() {
        return Math.atan2(this.imaginary, this.real);
    }
}
