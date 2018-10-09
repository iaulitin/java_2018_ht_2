package Bolodurin;

import Bolodurin.ComplexNumber;
import Bolodurin.ComplexNumberInterface;

public class Main {
    public static void main(String[] args) {
        ComplexNumber testNumber1 = new ComplexNumber(
                1, 3);
        ComplexNumber testNumber2 = new ComplexNumber(
                3, 4);
        ComplexNumber adding = (ComplexNumber)testNumber1.add(
                testNumber2);
        System.out.printf("%f %f\n",
                adding.getReal(), adding.getImage());
        ComplexNumber sub = (ComplexNumber)testNumber1.subtract(
                testNumber2);
        System.out.printf("%f %f\n",
                sub.getReal(), sub.getImage());
        ComplexNumber mult = (ComplexNumber)testNumber1.multiply(
                testNumber2);
        System.out.printf("%f %f\n",
                mult.getReal(), mult.getImage());
    }
}
