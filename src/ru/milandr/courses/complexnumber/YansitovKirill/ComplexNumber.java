package ru.milandr.courses.complexnumber.YansitovKirill;

import ru.milandr.courses.complexnumber.ComplexNumberInterface;

public class ComplexNumber implements ComplexNumberInterface {
    private double real;
    private double imagine;

    public ComplexNumber(double real, double imagine) {
        this.real = real;
        this.imagine = imagine;
    }

    public ComplexNumber(){}
    public double getReal(){return real;}
    public void setReal(double real){this.real = real;}
    public double getImagine(){return imagine;}
    public void setImagine(double imagine){this.imagine = imagine;}


    @Override
    public String toString()
    {
        if(real == 0 && imagine == 0)
            return "0";

        if(real == 0)
            return "i*" + imagine;

        if(imagine == 0)
            return ""+real;

        return real + " + i*" + imagine;
    }


    @Override
    public ComplexNumberInterface add(ComplexNumberInterface anotherNumber) {
        ComplexNumber another = (ComplexNumber) anotherNumber;
        return new ComplexNumber(real + another.real, imagine + another.real);
    }


    @Override
    public ComplexNumberInterface multiply(ComplexNumberInterface anotherNumber) {
        ComplexNumber another = (ComplexNumber) anotherNumber;

        double ret_real    = real*another.real - imagine*another.imagine;
        double ret_imagine = real*another.imagine + imagine*another.real;

        return new ComplexNumber(ret_real, ret_imagine);
    }


    @Override
    public ComplexNumberInterface divide(ComplexNumberInterface anotherNumber) {
        ComplexNumber another = (ComplexNumber) anotherNumber;

        double denominator = Math.pow(another.real, 2) - Math.pow(another.imagine, 2);
        if(denominator == 0)
        {
            System.out.println("Error: Zero division");
            return null;
        }

        double ret_real    = (real*another.real - imagine*another.imagine)/denominator;
        double ret_imagine = (real*another.imagine + imagine*another.real)/denominator;

        return new ComplexNumber(ret_real, ret_imagine);
    }


    @Override
    public ComplexNumberInterface negate() {
        return new ComplexNumber(-real, -imagine);
    }

    @Override
    public ComplexNumberInterface subtract(ComplexNumberInterface anotherNumber) {
        ComplexNumber another = (ComplexNumber) anotherNumber;
        return new ComplexNumber(real - another.real, imagine - another.real);
    }


    @Override
    public double calculateArgument() {
        if(real == 0)
        {
            if(imagine == 0)
            {
                System.out.println("Cant calculate argument of 0 + i*0");
                return -100;
            }

            return Math.signum(real)*Math.PI/2;
        }

        if(real > 0)
        {
            return Math.atan(imagine/real);
        }
        else
        {
            double atan = Math.atan(imagine/real);
            if(imagine >= 0)
            {
                return -atan + Math.PI/2;
            }
            else
            {
                return -(atan + Math.PI/2);
            }
        }

    }


    @Override
    public double calculateModulus() {
        return Math.sqrt(real*real + imagine*imagine);
    }

}
