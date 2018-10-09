package ru.milandr.courses.farm.alfyorova;

import ru.milandr.courses.farm.alfyorova.animal.Animal;
import ru.milandr.courses.farm.alfyorova.goods.Good;

/**
 * The classes implementing the interface should imitate
 * behaviour of a farmer, doing his regular stuff.
 */
public interface GenericFarmerInterface {
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