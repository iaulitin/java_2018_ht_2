package ru.milandr.courses.complexnumber.vorobyev;

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
        if (!(anotherNumber instanceof ComplexNumber)) {
            System.out.println("anotherNumber isn't a complex number");
            return this;
        }
        ComplexNumber anotherNumb = (ComplexNumber) anotherNumber;
        double resultReal = this.real + anotherNumb.real;
        double resultImaginary = this.imaginary + anotherNumb.imaginary;
        return new ComplexNumber(resultReal, resultImaginary);
    }

    @Override
    public ComplexNumberInterface subtract(ComplexNumberInterface anotherNumber) {
        if (!(anotherNumber instanceof ComplexNumber)) {
            System.out.println("anotherNumber isn't a complex number");
            return this;
        }
        ComplexNumber anotherNumb = (ComplexNumber) anotherNumber;
        double resultReal = this.real - anotherNumb.real;
        double resultImaginary = this.imaginary - anotherNumb.imaginary;
        return new ComplexNumber(resultReal, resultImaginary);

    }

    @Override
    public ComplexNumberInterface multiply(ComplexNumberInterface anotherNumber) {
        if (!(anotherNumber instanceof ComplexNumber)) {
            System.out.println("anotherNumber isn't a complex number");
            return this;
        }
        ComplexNumber anotherNumb = (ComplexNumber) anotherNumber;
        double resultReal = this.real * anotherNumb.real - this.imaginary * anotherNumb.imaginary;
        double resultImaginary = this.real * anotherNumb.imaginary + this.imaginary * anotherNumb.imaginary;
        return new ComplexNumber(resultReal, resultImaginary);
    }

    @Override
    public ComplexNumberInterface divide(ComplexNumberInterface anotherNumber) {
        if (!(anotherNumber instanceof ComplexNumber)) {
            System.out.println("Error! anotherNumber isn't a complex number");
            return this;
        }
        ComplexNumber anotherNumb = (ComplexNumber) anotherNumber;
        if(anotherNumb.calculateModulus() == 0) {
            System.out.println("Error! Division by zero");
            return this;
        }
        double resultReal = (this.real * anotherNumb.real + this.imaginary * anotherNumb.imaginary) / (Math.pow(anotherNumb.real, 2) + Math.pow(anotherNumb.imaginary, 2));
        double resultImaginary = (this.imaginary * anotherNumb.real - this.real * anotherNumb.imaginary) / (Math.pow(anotherNumb.real, 2) + Math.pow(anotherNumb.imaginary, 2));
        return new ComplexNumber(resultReal, resultImaginary);
    }

    @Override
    public ComplexNumberInterface negate() {
        return new ComplexNumber(-this.real, -this.imaginary);
    }

    @Override
    public double calculateModulus() {
        return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imaginary, 2));
    }

    @Override
    public double calculateArgument() {
        try{
            if(this.real == 0 && this.imaginary == 0)
                throw new ArithmeticException();
        }
        catch (ArithmeticException ae) {
            System.out.println("Argument indeterminate");
            return Double.NaN;
        }
        return Math.atan2(this.imaginary, this.real);
    }
}

