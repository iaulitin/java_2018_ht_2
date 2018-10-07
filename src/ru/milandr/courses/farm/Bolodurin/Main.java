package Bolodurin;

import Bolodurin.Cow;
import Bolodurin.Farmer;
import Bolodurin.Milk;

public class Main {

    public static void main(String[] args) {
        Farmer Alex = new Farmer();
        Cow Murka = new Cow();
        Milk couple = (Milk)Murka.produceGoods();
        Alex.collectGoods(couple);
        for(int i = 0; i < 8; i++)
        {
            couple.passDay();
            Alex.eatProduct(couple);
        }


    }
}
