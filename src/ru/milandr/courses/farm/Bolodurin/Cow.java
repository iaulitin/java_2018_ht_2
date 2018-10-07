package Bolodurin;

public class Cow implements Animal {

    @Override
    public void produceSound() {
        System.out.println("Mooo");
    }

    @Override
    public Good produceGoods() {
        Milk coupleMilk = new Milk(8);
        return coupleMilk;
    }
}