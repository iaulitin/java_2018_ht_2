package ru.milandr.courses.complexnumber.alfyorova;

public class ComplexNumber implements ComplexNumberInterface {
    private double Re;
    private double Im;

    ComplexNumber() {
        Re = 0;
        Im = 0;
    }

    ComplexNumber(double Re, double Im) {
        this.Re = Re;
        this.Im = Im;
        //System.out.println("Created");
    }

    public double getRe() {
        return Re;
    }

    public double getIm() {
        return Im;
    }

    public void setIm(double im) {
        Im = im;
    }

    public void setRe(double re) {
        Re = re;
    }

    @Override
    public String toString() {
        return Re + " + i* " + Im;
    }

    public ComplexNumberInterface add(ComplexNumberInterface anotherNumber) {
        double resRe = Re + anotherNumber.getRe();
        double resIm = Im + anotherNumber.getIm();
        return new ComplexNumber(resRe, resIm);
    }

    public ComplexNumberInterface subtract(ComplexNumberInterface anotherNumber) {
        double resRe = Re - anotherNumber.getRe();
        double resIm = Im - anotherNumber.getIm();
        return new ComplexNumber(resRe, resIm);
    }

    public ComplexNumberInterface multiply(ComplexNumberInterface anotherNumber) {
        double resRe = Re * anotherNumber.getRe() - Im * anotherNumber.getIm();
        double resIm = Im * anotherNumber.getRe() + Re * anotherNumber.getIm();
        return new ComplexNumber(resRe, resIm);
    }

    public ComplexNumberInterface divide(ComplexNumberInterface anotherNumber) {
        double resRe = (Re * anotherNumber.getRe() + Im * anotherNumber.getIm()) /
                (anotherNumber.getRe()*anotherNumber.getRe() + anotherNumber.getIm()*anotherNumber.getIm());
        double resIm = (Im * anotherNumber.getRe() - Re * anotherNumber.getIm()) /
                (anotherNumber.getRe()*anotherNumber.getRe() + anotherNumber.getIm()*anotherNumber.getIm());
        return new ComplexNumber(resRe, resIm);
    }

    public ComplexNumberInterface negate() {
        return new ComplexNumber(-Re, -Im);
    }

    public double calculateModulus() {
        return Math.sqrt(this.Re * this.Re + this.Im * this.Im);
    }

    public double calculateArgument() {
        if (this.Re != 0)
            return Math.atan(this.Im / this.Re); //deg
        else
            return 1;
    }
}
