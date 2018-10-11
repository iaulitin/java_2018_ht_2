package ru.milandr.courses.complexnumber.YansitovKirill;


public class Main {

    public static void main(String[] args) {
        ComplexNumber a1 = new ComplexNumber(1, 1);
        ComplexNumber a2 = new ComplexNumber(1, -1);
        ComplexNumber a3 = new ComplexNumber(-1, 1);
        ComplexNumber a4 = new ComplexNumber(-1, -1);

        System.out.println("Arg (1;1)   = " + 180*a1.calculateArgument()/Math.PI);
        System.out.println("Arg (1;-1)  = " + 180*a2.calculateArgument()/Math.PI);
        System.out.println("Arg (-1;1)  = " + 180*a3.calculateArgument()/Math.PI);
        System.out.println("Arg (-1;-1) = " + 180*a4.calculateArgument()/Math.PI);


        System.out.println("(1;1) * (1;-1) = " + a1.multiply(a2));
        System.out.println("abs((1;1))^2 = " + Math.pow(a1.calculateModulus(),2));
        System.out.println("(1;1)/(1;-1) = " + a1.divide(a2));
        System.out.println("(1,1)+(1,1) = " + a1.add(a1));
    }
}
