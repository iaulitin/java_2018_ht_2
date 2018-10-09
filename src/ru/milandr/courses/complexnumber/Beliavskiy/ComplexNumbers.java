package ru.milandr.courses.complexnumber.Beliavskiy;

import ru.milandr.courses.complexnumber.ComplexNumberInterface;

import javax.lang.model.type.NullType;

public class ComplexNumbers implements ComplexNumberInterface {
    private double real;
    private double img;

    public double getReal() {
        return this.real;
    }

    public double setReal() {
        return this.real;
    }

    public double getImg() {
        return this.img;
    }

    public double setImg() {
        return this.img;
    }

    public ComplexNumbers (double a) {
        this.real = a;
        this.img = 0;
    }

    public ComplexNumbers (double a, double b) {
        this.real = a;
        this.img = b;
    }

    @Override
    public ComplexNumberInterface add(ComplexNumberInterface anotherNumber) {
        ComplexNumbers another = (ComplexNumbers) anotherNumber;
        if (!(anotherNumber instanceof ComplexNumbers)) {
            System.out.print("INVALID_INPUT");
            return this;
        }
        return new ComplexNumbers(this.real + another.getReal(), this.img + another.getImg());
    }

    @Override
    public  ComplexNumberInterface subtract(ComplexNumberInterface anotherNumber) {
        ComplexNumbers another = (ComplexNumbers) anotherNumber;
        if (!(anotherNumber instanceof ComplexNumbers)) {
            System.out.print("INVALID_INPUT");
            return this;
        }
        return new ComplexNumbers(this.real - another.getReal(), this.img - another.getImg());
    }

    @Override
    public ComplexNumberInterface multiply(ComplexNumberInterface anotherNumber) {
        ComplexNumbers another = (ComplexNumbers) anotherNumber;
        if (!(anotherNumber instanceof ComplexNumbers)) {
            System.out.print("INVALID_INPUT");
            return this;
        }
        double nReal = this.real * another.getReal() - this.getImg() * another.getImg();
        double nImg = this.real * another.getImg() - this.getImg() * another.getReal();
        return new ComplexNumbers(nReal, nImg);
    }

    @Override
    public ComplexNumberInterface divide(ComplexNumberInterface anotherNumber) {
        ComplexNumbers another = (ComplexNumbers) anotherNumber;
        if (!(anotherNumber instanceof ComplexNumbers)) {
            System.out.print("INVALID_INPUT");
            return this;
        }
        if (another.calculateModulus() == 0) {
            System.out.print("Cannot divide on 0!!!!");
            return this;
        }
        double nReal = (this.real * another.getReal() - this.img * another.getImg()) / another.calculateModulus();
        double nImg = (this.img * another.getReal() - this.real * another.getImg()) / another.calculateModulus();
        return new ComplexNumbers(nImg, nReal);
    }

    @Override
    public ComplexNumberInterface negate(){
        return  new ComplexNumbers(-this.real, -this.img);
    }

    @Override
    public double calculateModulus(){
        return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.img, 2));
    }

    @Override
    public double calculateArgument(){
        return Math.atan2(this.img, this.real);
    }

}
