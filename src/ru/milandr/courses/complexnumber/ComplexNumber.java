package ru.milandr.courses.complexnumber.ozherelev;

import java.lang.Math;
import ru.milandr.courses.complexnumber.ComplexNumberInterface;

public class ComplexNumber implements ComplexNumberInterface
{
    private double real;
    private double imagine;

    public double getReal()
    {
        return this.real;
    }

    public double getImagine()
    {
        return this.imagine;
    }

    public void setImagine(double imagine)
    {
        this.imagine = imagine;
    }

    public void setReal(double real)
    {
        this.real = real;
    }

    public ComplexNumber(double real, double imagine)
    {
        this.real = real;
        this.imagine = imagine;
    }

    @Override
    public ComplexNumberInterface add(ComplexNumberInterface anotherNumber) {
        if (anotherNumber instanceof ComplexNumber)
        {
            ComplexNumber number = (ComplexNumber) anotherNumber;
            double newReal = this.real + number.getReal();
            double newImagine = this.imagine + number.getImagine();

            return new ComplexNumber(newReal, newImagine);
        }

        else
        {
            System.out.println("add error: can't make Complex number from anotherNumber");
            return anotherNumber;
        }
    }

    @Override
    public ComplexNumberInterface subtract(ComplexNumberInterface anotherNumber) {
        if (anotherNumber instanceof ComplexNumber)
        {
            ComplexNumber number = (ComplexNumber) anotherNumber;
            double newReal = this.real - number.getReal();
            double newImagine = this.imagine - number.getImagine();

            return new ComplexNumber(newReal, newImagine);
        }

        else
        {
            System.out.println("substract error: can't make Complex number from anotherNumber");
            return anotherNumber;
        }

    }

    @Override
    public ComplexNumberInterface multiply(ComplexNumberInterface anotherNumber) {
        if (anotherNumber instanceof ComplexNumber)
        {
            ComplexNumber number = (ComplexNumber) anotherNumber;
            double newReal  = this.real * number.getReal() - this.imagine * number.getImagine();
            double newImagine = this.real * number.getImagine() + this.imagine * number.getReal();

            return new ComplexNumber(newReal, newImagine);
        }

        else
        {
            System.out.println("multiply error: can't make ComplexNumber from anotherNumber");
            return anotherNumber;
        }

    }

    @Override
    public ComplexNumberInterface divide(ComplexNumberInterface anotherNumber) {

        if (anotherNumber instanceof ComplexNumber)
        {
            ComplexNumber number = (ComplexNumber) anotherNumber;

            if (number.getReal() == 0 && number.getImagine() == 0)
            {
                System.out.println("division by a zero");
                System.exit(-1);
            }

            double newReal = (this.real * number.getReal() + this.getImagine() * number.getImagine())
                    / (Math.pow(number.getReal(), 2.00) + Math.pow(number.getImagine(), 2.00));
            double newImagine = (this.imagine * number.getReal() - this.real * number.getImagine())
                    / (Math.pow(number.getReal(), 2.00) + Math.pow(number.getImagine(), 2.00));

            return new ComplexNumber(newReal, newImagine);
        }

        else
        {
            System.out.println("divide error: can't make Complex number from anotherNumber");
            return anotherNumber;
        }

    }

    @Override
    public ComplexNumberInterface negate() {
        double newReal = -this.real;
        double newImagine =  -this.imagine;

        return new ComplexNumber(newReal, newImagine);
    }

    @Override
    public double calculateModulus() {
        double modulus = Math.sqrt(Math.pow(this.real, 2.00) + Math.pow(this.imagine, 2.00));

        return modulus;
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
