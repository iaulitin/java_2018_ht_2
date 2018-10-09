package Bolodurin;

public class Farmer implements GenericFarmer {
    Good forEating[];
    int quantityGood;

    public Farmer()
    {
        forEating = new Good[100];
        quantityGood = 0;
    }

    @Override
    public void collectGoods(Good good) {
        if(good instanceof Egg)
        {
            System.out.println("Egg");
        }
        else if(good instanceof Milk)
        {
            System.out.println("Milk");
        }
        else if(good instanceof Cacao)
        {
            System.out.println("Cacao");
        }
        forEating[quantityGood] = good;
        quantityGood++;
    }

    @Override
    public void petAnAnimal(Animal animal) {
        if(animal instanceof Chicken)
        {
            System.out.println("Hello, chicken");

            ((Chicken)animal).produceSound();
        }
        else if(animal instanceof Cow)
        {
            System.out.println("Hello, cow");

            ((Cow)animal).produceSound();
        }
        else if(animal instanceof Cacaocow)
        {
            System.out.println("Hello, unreal cacaocow");

            ((Cacaocow)animal).produceSound();
        }
    }

    @Override
    public void eatProduct(Good good) {
        if(good instanceof Egg)
        {

            if(((Egg) good).statusFresh)
            {
                System.out.println("Beautiful");
            }
            else
            {
                System.out.println("Angry!!1");
            }
        }
        else if(good instanceof Milk)
        {
            if(((Milk) good).statusFresh)
            {
                System.out.println("Beautiful");
            }
            else
            {
                System.out.println("Angry!!1");
            }
        }
        else if(good instanceof Cacao)
        {
            if(((Cacao) good).statusFresh)
            {
                System.out.println("Beautiful");
            }
            else
            {
                System.out.println("Angry!!1");
            }
        }

    }
}
