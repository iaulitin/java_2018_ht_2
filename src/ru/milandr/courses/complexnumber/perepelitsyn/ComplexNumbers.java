package ru.milandr.courses.complexnumber.perepelitsyn;

public class ComplexNumbers implements ComplexNumberInterface{

    private double real;
    private double imagine;

    public double getReal(){
        return this.real;
    }
    public double getImagine(){
        return this.imagine;
    }

    ComplexNumbers(double real, double imagine){

        this.real = real;
        this.imagine = imagine;
    }

    @Override
    public ComplexNumberInterface add(ComplexNumberInterface anotherNumber) {

        ComplexNumbers another = (ComplexNumbers) anotherNumber;
        double newReal = this.real + another.getReal();
        double newImagine = this.imagine + another.getImagine();
        ComplexNumbers add = new ComplexNumbers(newReal, newImagine);
        System.out.printf("add is %f %f\n", newReal, newImagine);
        return add;
    }

    @Override
    public ComplexNumberInterface subtract(ComplexNumberInterface anotherNumber){

        ComplexNumbers another = (ComplexNumbers) anotherNumber;
        double newReal = this.real - another.getReal();
        double newImagine = this.imagine - another.getImagine();
        ComplexNumbers subtract = new ComplexNumbers(newReal, newImagine);
        System.out.printf("subtract is %f %f\n", newReal, newImagine);
        return subtract;
    }

    @Override
    public ComplexNumberInterface multiply(ComplexNumberInterface anotherNumber){

        ComplexNumbers another = (ComplexNumbers) anotherNumber;
        double newReal = this.real * another.getReal() - this.imagine * another.getImagine();
        double newImagine = this.real * another.getImagine() + this.imagine * another.getReal();
        ComplexNumbers multiply = new ComplexNumbers(newReal, newImagine);
        System.out.printf("multiply is %f %f\n", newReal, newImagine);
        return multiply;
    }
    @Override
    public  ComplexNumberInterface divide(ComplexNumberInterface anotherNumber){

        ComplexNumbers another = (ComplexNumbers) anotherNumber;
        if (another.getReal() == 0 && another.getImagine() == 0){
            System.out.printf("U can not divide");
            System.exit(-1);
        }
        double newReal = (this.real * another.real + this.imagine * another.imagine) / another.calculateModulus();
        double newImagine = (this.imagine * another.real - this.real * another.imagine) / another.calculateModulus();
        ComplexNumbers divide = new ComplexNumbers(newReal, newImagine);
        System.out.printf("divide is %f %f\n", newReal, newImagine);
        return divide;
    }

    @Override
    public ComplexNumberInterface negate() {

        double newReal = -this.real;
        double newImagine = -this.imagine;
        ComplexNumbers negative = new ComplexNumbers(newReal, newImagine);
        System.out.printf("negative is %f %f\n", newReal, newImagine);
        return negative;
    }

    @Override
    public double calculateModulus() {

        double modulus = Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imagine, 2));
        System.out.printf("modulus is %f\n", modulus);
        return modulus;
    }

    @Override
    public double calculateArgument() {

        double argument = Math.atan2(this.imagine, this.real);
        System.out.printf("argument is %f\n", argument);
        return argument;
    }

}
    interface ComplexNumberInterface {

        /**
         * @param anotherNumber a number to add to current number
         * @return complex number representing operation result
         */
        ComplexNumberInterface add(ComplexNumberInterface anotherNumber);

        /**
         * @param anotherNumber a number to subtract from current number
         * @return complex number representing operation result (this minus another)
         */
        ComplexNumberInterface subtract(ComplexNumberInterface anotherNumber);

        /**
         * @param anotherNumber a number of times to take current number
         * @return complex number representing operation result
         */
        ComplexNumberInterface multiply(ComplexNumberInterface anotherNumber);

        /**
         * @param anotherNumber a number to divide by
         * @return complex number representing operation result (this divided by another)
         */
        ComplexNumberInterface divide(ComplexNumberInterface anotherNumber);

        /**
         * @return result of current complex number negating
         */
        ComplexNumberInterface negate();

        /**
         * @return modulus value for current complex number
         */
        double calculateModulus();

        /**
         * @return argument value for current complex number
         */
        double calculateArgument();
    }
