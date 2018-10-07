package Bolodurin;

public class Chicken implements Animal{

    @Override
    public void produceSound(){
        System.out.println("Co-co-co");
    }

    @Override
    public Good produceGoods() {
        Egg newEgg = new Egg(30);
        return newEgg;
    }

    public void earlyGetUp(){
        produceSound();
    }
}
