package ru.milandr.courses.complexnumber.sitnikov;

import ru.milandr.courses.complexnumber.ComplexNumberInterface;

public class ComplexNumber implements ComplexNumberInterface {
    public static final String CAST_WARNING = "Warning: anotherNumber isn't instance if ComplexNumber! Returning self";
    public static final String DIVIDE_WARNING = "Warning: you divides on 0; returning self";
    private double real;
    private double imagine;

    public double getReal() {
        return this.real;
    }


    public double getImagine() {
        return this.imagine;
    }

    public double setReal() {
        return this.real;
    }


    public double setImagine() {
        return this.imagine;
    }

    public ComplexNumber(double a) {
        this.real = a;
        this.imagine = 0;
    }

    public ComplexNumber(double a, double b) {
        this.real = a;
        this.imagine = b;
    }


    @Override
    public ComplexNumberInterface add(ComplexNumberInterface anotherNumber) {
        if (!(anotherNumber instanceof ComplexNumber)) {
            System.out.println(CAST_WARNING);
            return this;
        }
        ComplexNumber another = (ComplexNumber) anotherNumber;
        return new ComplexNumber(this.real + another.getReal(), this.imagine + another.getImagine());
    }


    @Override
    public ComplexNumberInterface subtract(ComplexNumberInterface anotherNumber) {
        if (!(anotherNumber instanceof ComplexNumber)) {
            System.out.println(CAST_WARNING);
            return this;
        }
        ComplexNumber another = (ComplexNumber) anotherNumber;
        return new ComplexNumber(this.real - another.getReal(), this.imagine - another.getImagine());
    }

    @Override
    public ComplexNumberInterface multiply(ComplexNumberInterface anotherNumber) {
        if (!(anotherNumber instanceof ComplexNumber)) {
            System.out.println(CAST_WARNING);
            return this;
        }
        ComplexNumber another = (ComplexNumber) anotherNumber;
        double newReal = this.real * another.getReal() - this.imagine * another.getImagine();
        double newImagine = this.real * another.getImagine() + this.imagine * another.getReal();
        return new ComplexNumber(newReal, newImagine);
    }

    @Override
    public ComplexNumberInterface divide(ComplexNumberInterface anotherNumber) {
        if (!(anotherNumber instanceof ComplexNumber)) {
            System.out.println(CAST_WARNING);
            return this;
        }
        ComplexNumber another = (ComplexNumber) anotherNumber;
        if(another.calculateModulus() == 0){
            System.out.println(DIVIDE_WARNING);
            return this;
        }
        double newReal = (this.getReal() * another.getReal() + this.imagine * another.getImagine()) / another.calculateModulus();
        double newImagine = (this.imagine * another.getReal() - this.real * another.getImagine()) / another.calculateModulus();
        return new ComplexNumber(newReal, newImagine);
    }

    @Override
    public ComplexNumberInterface negate() {
        return new ComplexNumber(-this.real, -this.imagine);
    }

    @Override
    public double calculateModulus() {
        return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imagine, 2));
    }

    @Override
    public double calculateArgument() {
        return Math.atan2(this.imagine, this.real);
    }

}
