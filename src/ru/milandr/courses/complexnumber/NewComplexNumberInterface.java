package ru.milandr.courses.complexnumber;

public interface NewComplexNumberInterface {

    /**
     * @param anotherNumber a number to add to current number
     * @return complex number representing operation result
     */
    NewComplexNumberInterface add(NewComplexNumberInterface anotherNumber);

    /**
     * @param anotherNumber a number to subtract from current number
     * @return complex number representing operation result (this minus another)
     */
    NewComplexNumberInterface subtract(NewComplexNumberInterface anotherNumber);

    /**
     * @param anotherNumber a number of times to take current number
     * @return complex number representing operation result
     */
    NewComplexNumberInterface multiply(NewComplexNumberInterface anotherNumber);

    /**
     * @param anotherNumber a number to divide by
     * @return complex number representing operation result (this divided by another)
     */
    NewComplexNumberInterface divide(NewComplexNumberInterface anotherNumber);

    /**
     * @return result of current complex number negating
     */
    NewComplexNumberInterface negate();

    /**
     * @return modulus value for current complex number
     */
    double calculateModulus();

    /**
     * @return argument value for current complex number
     */
    double calculateArgument();

    double getReal();

    double getImagine();
}