package ru.milandr.courses.farm.perepelitsyn;
import java.util.ArrayList;
import java.util.List;

public class GenericFarmer implements Farmer{

    List<Good> collectedGoods = new ArrayList<>();

    @Override
    public void collectGoods(Good good){

        this.collectedGoods.add(good);
        System.out.println(collectedGoods);
    }


    @Override
    public void petAnAnimal(Animal animal){

        System.out.println("Hello "+ animal);
        animal.produceSound();
    }

    @Override
    public void eatProduct(Good good){
        Good meal = (Good) good;
        if (meal.isRotten = true){
            System.out.printf("AAAARRRRGHHHHH ROTTEN \n");
            return;
        }
        if (good instanceof Milk) {
            System.out.println("So cold milk \n");
        } else if (good instanceof Eggs) {
            System.out.println("I like eggs \n");
        } else if (good instanceof Wool) {
            System.out.println("No, I shouldn't eat it \n");
        }

    }
}
/**
 * The classes implementing the interface should imitate
 * behaviour of a farmer, doing his regular stuff.
 */
interface Farmer {

    /**
     * A farmer collect goods produced by some Animal.
     * The farmer should print a specific type of a good after collecting it.
     *
     * @param good to collect
     */
    void collectGoods(Good good);

    /**
     * A farmer pets an animal and the animal produces its common sound.
     * <p>
     * The method should print a specific type of an animal. Like "Hello pig" or "Hello cow".
     */
    void petAnAnimal(Animal animal);

    /**
     * The GenericFarmer eating different goods should react in
     * different ways.
     * If the {@link Good} is rotten, the farmer should go angry.
     *
     * @param good - a good to eat.
     */
    void eatProduct(Good good);
}