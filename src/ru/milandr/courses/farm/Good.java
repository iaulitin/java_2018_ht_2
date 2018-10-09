package ru.milandr.courses.farm;

/**
 * Common interface representing a good (Milk, eggs, etc) produced by an animal.
 */
public interface Good {

    /**
     * After having this method called once,
     * the {@link Good} makes a {@link GenericFarmer} react
     * as if it doesn't taste that good.
     * <p>`
     * Different products should have different periods
     * of being fresh.
     * <p>
     * After getting rotten a product can not become a good one.
     */
    void goRotten();
}