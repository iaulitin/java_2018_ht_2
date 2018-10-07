
public class Main {

    public static void main(String[] args) {
        ComplexNumber a1 = new ComplexNumber( 1, 1);
        ComplexNumber a2 = new ComplexNumber(-1, 1);
        ComplexNumber a3 = new ComplexNumber(-1,-1);
        ComplexNumber a4 = new ComplexNumber( 1,-1);
        System.out.println(180*a1.calculateArgument()/Math.PI);
        System.out.println(180*a2.calculateArgument()/Math.PI);
        System.out.println(180*a3.calculateArgument()/Math.PI);
        System.out.println(180*a4.calculateArgument()/Math.PI);
    }
}
