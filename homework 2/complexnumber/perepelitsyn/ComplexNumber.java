package ru.milandr.courses.complexnumber.perepelitsyn;


class ComplexNumber implements ComplexNumberInterface {
    int real;
    int imagine;

    public void ComplexNumberPrintLn(){
        System.out.println(this.real + "+" + this.imagine + "*i" );
    }

    public int getReal(){
        return this.real;
    }
    public int getImagine(){
        return this.imagine;
    }

    public ComplexNumber(int real, int imagine){
        this.real = real;
        this.imagine = imagine;
    }

    @Override
    public ComplexNumberInterface add(ComplexNumberInterface anotherNumber) {
        if (anotherNumber instanceof ComplexNumber) {
            ComplexNumber another = (ComplexNumber) anotherNumber;
            int newReal = this.real + another.getReal();
            int newImagine = this.imagine + another.getImagine();
            ComplexNumber add = new ComplexNumber(newReal, newImagine);
            add.ComplexNumberPrintLn();
            return add;
        }
        return null;
    }


    @Override
    public ComplexNumberInterface subtract(ComplexNumberInterface anotherNumber) {
        ComplexNumber another = (ComplexNumber) anotherNumber;
        int newReal = this.real - another.getReal();
        int newImagine = this.imagine - another.getImagine();
        ComplexNumber subtract = new ComplexNumber(newReal, newImagine);
        subtract.ComplexNumberPrintLn();
        return subtract;
    }

    @Override
    public ComplexNumberInterface multiply(ComplexNumberInterface anotherNumber) {
        ComplexNumber another = (ComplexNumber) anotherNumber;
        int newReal = this.real * another.getReal() - this.imagine * another.getImagine();
        int newImagine = this.real * another.getImagine() + this.imagine * another.getReal();
        ComplexNumber multiply = new ComplexNumber(newReal, newImagine);
        multiply.ComplexNumberPrintLn();
        return multiply;
    }

    @Override
    public ComplexNumberInterface divide(ComplexNumberInterface anotherNumber) {
        ComplexNumber another = (ComplexNumber) anotherNumber;
        if (another.getReal() == 0 && another.getImagine() == 0){
            System.out.printf("Деление на ноль");
            System.exit(-1);
        }
        int newReal = (int) ((this.real * another.real + this.imagine * another.imagine) / another.calculateModulus());
        int newImagine = (int) ((this.imagine * another.real - this.real * another.imagine) / another.calculateModulus());
        ComplexNumber divide = new ComplexNumber(newReal, newImagine);
        divide.ComplexNumberPrintLn();
        return divide;
    }

    @Override
    public ComplexNumberInterface negate() {
        int newReal = -this.real;
        int newImagine = -this.imagine;
        ComplexNumber negative = new ComplexNumber(newReal, newImagine);
        negative.ComplexNumberPrintLn();
        return negative;
    }

    @Override
    public double calculateModulus() {
        return Math.sqrt(Math.pow(this.imagine,2) + Math.pow(this.real,2));
    }

    @Override
    public double calculateArgument() {
        double argument = Math.atan2(this.imagine, this.real);
        return argument;
    }
}
