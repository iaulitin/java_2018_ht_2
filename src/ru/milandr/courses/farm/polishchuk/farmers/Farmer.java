package ru.milandr.courses.farm.polishchuk.farmers;

import ru.milandr.courses.farm.Animal;
import ru.milandr.courses.farm.GenericFarmer;
import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.polishchuk.goods.*;
import ru.milandr.courses.farm.polishchuk.animals.*;

public class Farmer implements GenericFarmer {
    private String name;
    private boolean hungry = true;

    public Farmer() {
        this.name = "Unnamed";
    }

    public Farmer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void timeToEat() {
        hungry = true;
    }

    public void collectGoods(Good good) {
        System.out.print("Collected: ");
        if (good instanceof Milk) {
            System.out.format("%.2f Liters of milk\n", ((Milk) good).getVolume());
        } else if (good instanceof Egg) {
            System.out.format("%s egg\n", ((Egg) good).getColor());
        } else if (good instanceof Meat) {
            System.out.format("%.2f Kilos of meat from %s\n", ((Meat) good).getProducer());
        } else {
            System.err.println("undefined good");
        }
    }

    private void sayHelloToAnimal(Animal animal) {
        if (animal instanceof Cock) {
            System.out.println("Hello cock");
        } else if (animal instanceof Cow) {
            System.out.println("Hello cow");
        }
    }

    @Override
    public void petAnAnimal(Animal animal) {
        this.sayHelloToAnimal(animal);
        animal.produceSound();
    }

    private void sayNotHungryPhrase() {
        System.out.println("I'm not hungry, why are you feeding me?");
    }

    @Override
    public void eatProduct(Good good) {
        if (good == null) {
            System.err.println("null good for eat given");
        }
        if (good instanceof Milk) {
            if (!hungry) {
                sayNotHungryPhrase();
            }
            if (!((Milk) good).isEaten()) {
                if (((Milk) good).isRotten()) {
                    System.out.println("Ugh, kefir((((");
                } else {
                    System.out.println("Nice milk");
                }
                ((Milk) good).eat();
            } else {
                System.err.println("I'm trying to eat nothing");
            }
            hungry = false;
        } else if (good instanceof Egg) {
            if (!hungry) {
                sayNotHungryPhrase();
            }
            if (!((Egg) good).isEaten()) {
                if (((Egg) good).isRotten()) {
                    System.out.println("Disgusting taste end smells like trash, I should have understood");
                } else {
                    System.out.println("Mmmmm, eggs");
                }
                ((Egg) good).eat();
            } else {
                System.err.println("I'm trying to eat nothing");
            }
            hungry = false;
        } else if (good instanceof Meat) {
            if (!hungry) {
                sayNotHungryPhrase();
            }
            if (!((Meat) good).isEaten()) {
                if (((Meat) good).isRotten()) {
                    System.out.println("I'm really angry, this meat is actually dead");
                } else {
                    System.out.println("Nice meat from " + ((Meat) good).getProducer());
                }
                ((Meat) good).eat();
            } else {
                System.err.println("I'm trying to eat nothing");
            }
            hungry = false;
        } else {
            System.err.println("I prefer not to eat strange objects");
        }
    }
}