package Bolodurin;
import  Bolodurin.ComplexNumberInterface;

public class ComplexNumber implements
        ComplexNumberInterface{
    private double real;
    private double image;


    public ComplexNumber(double real_init, double image_init)
    {
        this.real = real_init;
        this.image = image_init;
    }

    public double getReal() {
        return real;
    }

    public double getImage() {
        return image;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImage(double image) {
        this.image = image;
    }

    public ComplexNumber toComplexNumber(
            ComplexNumberInterface anotherNumber)
    {
        if(anotherNumber instanceof ComplexNumber)
        {
            return (ComplexNumber) anotherNumber;
        }
        return null;
    }

    @Override
    public ComplexNumberInterface add(
            ComplexNumberInterface anotherNumber)
    {
        ComplexNumber anotherNumber1 = toComplexNumber(
                anotherNumber);
        assert anotherNumber1!=null;

        ComplexNumber result = new ComplexNumber(
                this.real+anotherNumber1.real,
                this.image+anotherNumber1.image);
        return result;
    }

    @Override
    public ComplexNumberInterface subtract(
            ComplexNumberInterface anotherNumber)
    {
        ComplexNumber anotherNumber1 = toComplexNumber(
                anotherNumber);
        assert anotherNumber1!=null;

        ComplexNumber result = new ComplexNumber(
                this.real-anotherNumber1.real,
                this.image-anotherNumber1.image);
        return result;
    }

    @Override
    public ComplexNumberInterface multiply(
            ComplexNumberInterface anotherNumber)
    {
        ComplexNumber anotherNumber1 = toComplexNumber(
                anotherNumber);
        assert anotherNumber1!=null;

        double x1 = this.real;
        double y1 = this.image;
        double x2 = anotherNumber1.real;
        double y2 = anotherNumber1.image;

        ComplexNumber result = new ComplexNumber(
                x1*x2 - y1*y2,
                x1*y2+x2*y1);
        return result;
    }

    @Override
    public ComplexNumberInterface divide(
            ComplexNumberInterface anotherNumber)
    {
        ComplexNumber anotherNumber1 = toComplexNumber(
                anotherNumber);
        assert anotherNumber1!=null;
        double x1 = this.real;
        double y1 = this.image;
        double x2 = anotherNumber1.real;
        double y2 = anotherNumber1.image;
        assert x2*x2+y2*y2 == 0;
        ComplexNumber result = new ComplexNumber(
                (x1*x2-y1*y2)/(x2*x2+y2*y2),
                (y1*x2+y2*x1)/(x2*x2+y2*y2));
        return result;
    }

    @Override
    public ComplexNumberInterface negate()
    {
        ComplexNumber result = new ComplexNumber(
                -this.real,
                -this.image);
        return result;
    }

    @Override
    public double calculateModulus() {
        return Math.sqrt(real*real + image*image);
    }

    @Override
    public double calculateArgument() {
        assert calculateModulus() != 0;
        if(this.real == 0)
        {
            if(this.image > 0){ return Math.PI/2;}
            else if(this.image < 0) {return -Math.PI/2;}
        }
        else if(this.real > 0)
            { return Math.atan(image/real);}
        else if(this.image > 0)
            { return Math.PI - Math.atan(image/real);}
        else
            {return -Math.PI + Math.atan(image/real);}
        return 0.0/0.0;
    }
}
