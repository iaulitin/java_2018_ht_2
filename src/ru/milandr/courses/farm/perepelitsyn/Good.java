package ru.milandr.courses.farm.perepelitsyn;

import java.util.Date;

public class Good implements Goods{

    protected boolean isRotten;
    protected long createTime;
    protected static long rottenTime;

    public static void setRottenTime(long rottenTime) {
        Good.rottenTime = rottenTime;
    }


    public Good(){
        goRotten();
    }
    public boolean isRotten() {
        Date data = new Date();
        long currentTime = data.getTime();

        if (currentTime >= createTime + rottenTime) {
            return true;
        } else {
            return false;
        }
    }
        @Override
        public void goRotten() {
            Date data = new Date();
            createTime = data.getTime();
        }

}
/**
 * Common interface representing a good (Milk, eggs, etc) produced by an animal.
 */
interface Goods {

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