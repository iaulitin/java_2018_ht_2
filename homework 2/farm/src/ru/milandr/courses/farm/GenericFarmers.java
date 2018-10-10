package ru.milandr.courses.farm;

import java.util.ArrayList;
import java.util.List;



    public class GenericFarmers  implements GenericFarmer {
        List<Good> collectedGoods = new ArrayList<>();

        public void collectGoods(Good good){
            this.collectedGoods.add(good);
            System.out.println(collectedGoods);
        }

        public void petAnimal(Animal animal){
            System.out.println("Hello "+ animal);
            animal.produceSound();
        }


        public void eatProduct(Good good){
            Goods meal = (Goods) good;
            if (meal.isRotten = true){
                System.out.printf("ROTTEN \n");
                return;
            }
            if (good instanceof Milk) {
                System.out.println("hm.....teasty milk \n");
            } else if (good instanceof Eggs) {
                System.out.println("I like eggs! \n");
            } else if (good instanceof Meat) {
                System.out.println("Sorry, i am vegetarian \n");
            }
        }
}
