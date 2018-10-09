package ru.milandr.courses.farm.alfyorova;

import ru.milandr.courses.farm.alfyorova.goods.Good;
import ru.milandr.courses.farm.alfyorova.farmer.GenericFarmer;
/**
 * Common interface representing a good (Milk, eggs, etc) produced by an animal.
 */
public interface GoodInterface {
    /**
     * After having this method called once,
     * the {@link Good} makes a {@link GenericFarmer} react
     * as if it doesn't taste that good.
     * <p>
     * Different products should have different periods
     * of being fresh.
     * <p>
     * After getting rotten a product can not become a good one.
     */
    void goRotten();
}
