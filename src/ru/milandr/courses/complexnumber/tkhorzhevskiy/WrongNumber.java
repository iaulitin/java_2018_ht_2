package ru.milandr.courses.complexnumber.tkhorzhevskiy;

import ru.milandr.courses.complexnumber.ComplexNumberInterface;

public class WrongNumber implements ComplexNumberInterface {



    @Override
    public ComplexNumberInterface add(ComplexNumberInterface anotherNumber) {
        return null;
    }

    @Override
    public ComplexNumberInterface subtract(ComplexNumberInterface anotherNumber) {
        return null;
    }

    @Override
    public ComplexNumberInterface multiply(ComplexNumberInterface anotherNumber) {
        return null;
    }

    @Override
    public ComplexNumberInterface divide(ComplexNumberInterface anotherNumber) {
        return null;
    }

    @Override
    public ComplexNumberInterface negate() {
        return null;
    }

    @Override
    public double calculateModulus() {
        return 0;
    }

    @Override
    public double calculateArgument() {
        return 0;
    }

    @Override
    public double getReal() {
        return 0;
    }

    @Override
    public double getImaginary() {
        return 0;
    }
}
