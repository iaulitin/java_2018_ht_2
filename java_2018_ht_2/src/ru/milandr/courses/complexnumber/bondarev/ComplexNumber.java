package ru.milandr.courses.complexnumber.bondarev;


public class ComplexNumber implements ComplexNumberInterface {
    private static double Rez;
    private static double Imz;


    /**
     * @param Rez shows real part of "z" complex number
     * @param Imz shows imaginery part of "z" complex number
     */

    public ComplexNumber(double Rez, double Imz) {
        this.Rez = Rez;
        this.Imz = Imz;
    }

    public static double getRez() {
        return Rez;
    }

    public static void setRez(double rez) {
        Rez = rez;
    }

    public static double getImz() {
        return Imz;
    }

    public static void setImz(double imz) {
        Imz = imz;
    }



    @Override
    public ComplexNumberInterface add(ComplexNumberInterface anotherNumber) {

        if (!(anotherNumber instanceof ComplexNumber)) {
            System.out.println("An error oqured, argument isn't a complex number");
            return this;
        }

        ComplexNumber another = (ComplexNumber) anotherNumber;
        double rez = this.Rez + another.Rez;
        double imz = this.Imz + another.Imz;
        return new ComplexNumber(rez, imz);

    }

    @Override
    public ComplexNumberInterface subtract(ComplexNumberInterface anotherNumber) {

        if (!(anotherNumber instanceof ComplexNumber)) {
            System.out.println("An error oqured, argument isn't a complex number");
            return this;
        }

        ComplexNumber another = (ComplexNumber) anotherNumber;
        double rez = this.Rez - another.Rez;
        double imz = this.Imz - another.Imz;
        return new ComplexNumber(rez, imz);

    }

    @Override
    public ComplexNumberInterface multiply(ComplexNumberInterface anotherNumber) {

        if (!(anotherNumber instanceof ComplexNumber)) {
            System.out.println("An error oqqurred, argument isn't a complex number");
            return this;
        }

        ComplexNumber another = (ComplexNumber) anotherNumber;
        double rez = this.Rez * another.Rez - this.Imz * another.Imz;
        double imz = this.Rez * another.Imz + this.Imz * another.Rez;
        return new ComplexNumber(rez, imz);

    }

    @Override
    public ComplexNumberInterface divide(ComplexNumberInterface anotherNumber) {

        if (!(anotherNumber instanceof ComplexNumber)) {
            System.out.println("An error oqqurred, argument isn't a complex number");
            return this;
        }

        ComplexNumber another = (ComplexNumber) anotherNumber;

        if (another.calculateModulus() == 0) {
            System.out.println("An error oqqurred, division by zero");
            return this;
        }

        double resultReal = (this.Rez * another.Rez + this.Imz * another.Imz)
                /
                (Math.pow(another.Rez, 2) + Math.pow(another.Imz, 2));

        double resultImaginary = (this.Imz * another.Rez - this.Rez * another.Imz)
                /
                (Math.pow(another.Rez, 2) + Math.pow(another.Imz, 2));

        return new ComplexNumber(resultReal, resultImaginary);

    }

    @Override
    public ComplexNumberInterface negate() {
        return new ComplexNumber(-this.Rez, -this.Imz);
    }

    @Override
    public double calculateModulus() {
        return Math.sqrt(Math.pow(this.Rez, 2) + Math.pow(this.Imz, 2));
    }

    @Override
    public double calculateArgument() {
        return ((this.Rez != 0) ? Math.atan(this.Imz / this.Rez) : Math.PI / 2);
    }
}
