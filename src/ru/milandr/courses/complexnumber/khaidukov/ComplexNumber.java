package complexNumbers;

public class ComplexNumber implements ComplexNumberInterface {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    @Override
    public ComplexNumberInterface add(ComplexNumberInterface anotherNumber) {
        ComplexNumber another = (ComplexNumber) anotherNumber;
        return new ComplexNumber (this.real + another.real,
                this.imaginary + another.imaginary);
    }

    @Override
    public ComplexNumberInterface subtract(ComplexNumberInterface anotherNumber) {
        ComplexNumber another = (ComplexNumber) anotherNumber;
        return new ComplexNumber (this.real - another.real,
                this.imaginary - another.imaginary);
    }

    @Override
    public ComplexNumberInterface multiply(ComplexNumberInterface anotherNumber) {
        ComplexNumber another = (ComplexNumber) anotherNumber;
        return new ComplexNumber(this.real * another.real - this.imaginary * another.imaginary,
                this.real * another.real + this.imaginary * another.imaginary);
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
    public ComplexNumberInterface divide (ComplexNumberInterface anotherNumber) {
        ComplexNumber another = (ComplexNumber) anotherNumber;
        double mod = another.calculateModulus();
        double re = (this.getReal() * another.getReal() + this.imaginary * another.getImaginary()) / mod;
        double im = (this.imaginary * another.getReal() - this.real * another.getImaginary()) / mod;
        return new ComplexNumber(re, im);
    }

    @Override
    public double calculateArgument() {
        return Math.atan (this.imaginary / this.real);
    }
}