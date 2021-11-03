package ru.milandr.courses.complexnumber;

public interface ComplexNumberInterface {

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

    /**
     *
     * @return value of real part of complex nubmer
     */
    double getReal();

    /**
     *
     * @return value of imaginary part of complex number
     */
    double getImaginary();
}