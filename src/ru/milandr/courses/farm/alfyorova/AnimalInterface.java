package ru.milandr.courses.farm.alfyorova;

import ru.milandr.courses.farm.alfyorova.goods.Good;

/**
 * Interface, representing generic animal from the farm.
 * <p>
 * All classes, implementing the interface, should have non-empty
 * implementation for all generic "AnimalInterface" methods.
 *
 * Note: Each implementation of the interface should have some specific methods, which
 * are representative for this AnimalInterface Type (e.g. takeNapInDirt for Pigs)!
 */

public interface AnimalInterface {
    /**
     * Prints a sound, that the animal can produce.
     */
    void produceSound();

    /**
     * The method returns a {@link Good}, produced by an animal.
     * E.g.: a chicken provides eggs and meat.
     * But providing meat is a little bit lethal for it.
     * That way, only Egg object can be returned by a chicken from that method.
     *
     * @return representation of a produced Good
     */
    Good produceGoods();
}