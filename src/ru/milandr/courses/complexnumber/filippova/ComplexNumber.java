package ru.milandr.courses.complexnumber.filippova;

import ru.milandr.courses.complexnumber.ComplexNumberInterface;

public class ComplexNumber implements ComplexNumberInterface {
    private double real;
    private double image;

    public ComplexNumber(double r, double i) {
        this.real = r;
        this.image = i;
    }


    public double getImage() {
        return this.image;
    }

    public void setImage(double image) {
        this.image = image;
    }

    public double getReal() {
        return this.real;
    }

    public void setReal(double real) {
        this.real = real;
    }


    @Override
    public ComplexNumberInterface add(ComplexNumberInterface anotherNumber) {
        try {
            if (!(anotherNumber instanceof ComplexNumber)) {
                throw new ClassCastException();
            }

        } catch (ClassCastException c) {
            System.out.println("Error");
        }
        ComplexNumber number = (ComplexNumber) anotherNumber;
        ComplexNumber sum = new ComplexNumber(this.real + number.getReal(), this.image + number.getImage());
        return (sum);
    }

    @Override
    public ComplexNumberInterface subtract(ComplexNumberInterface anotherNumber) {
        try {
            if (!(anotherNumber instanceof ComplexNumber)) {
                throw new ClassCastException();
            }

        } catch (ClassCastException c) {
            System.out.println("Error");
        }
        ComplexNumber number = (ComplexNumber) anotherNumber;
        ComplexNumber difference = new ComplexNumber(this.real - number.getReal(), this.image - number.getImage());
        return (difference);
    }

    @Override
    public ComplexNumberInterface multiply(ComplexNumberInterface anotherNumber) {
        try {
            if (!(anotherNumber instanceof ComplexNumber)) {
                throw new ClassCastException();
            }
        } catch (ClassCastException c) {
            System.out.println("Error");
        }
        ComplexNumber number = (ComplexNumber) anotherNumber;
        ComplexNumber multiplication = new ComplexNumber(this.real * number.getReal() - this.image * number.getImage(), this.real * number.getImage() + this.image * number.getReal());
        return (multiplication);
    }

    @Override
    public ComplexNumberInterface divide(ComplexNumberInterface anotherNumber) {
        try {
            if (!(anotherNumber instanceof ComplexNumber)) {
                throw new ClassCastException();
            }

        } catch (ClassCastException c) {
            System.out.println("Error");
        }
        ComplexNumber number = (ComplexNumber) anotherNumber;
        ComplexNumber division = new ComplexNumber((this.real * number.getReal() + this.image * number.getImage()) / (number.getReal() * number.getReal() + number.getImage() * number.getImage()), (number.getReal() * this.image - this.real * number.getImage()) / (number.getReal() * number.getReal() + number.getImage() * number.getImage()));
        return (division);
    }

    @Override
    public ComplexNumberInterface negate() {
        ComplexNumber negation = new ComplexNumber(-this.real, -this.image);
        return (negation);

    }

    @Override
    public double calculateModulus() {
        return Math.sqrt(this.real * this.real + this.image * this.image);
    }

    @Override
    public double calculateArgument() {
        try {
            if (this.real == 0 && this.image == 0) {
                throw new ArithmeticException();
            }

        } catch (ArithmeticException ae) {
            System.out.println("Argument is not defined");
            return 0;
        }

        return (Math.atan2(this.image, this.real));


    }


}
