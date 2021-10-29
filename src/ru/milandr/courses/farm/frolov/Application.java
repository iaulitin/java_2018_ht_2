package ru.milandr.courses.farm.frolov;

import ru.milandr.courses.farm.frolov.animals.Cow;
import ru.milandr.courses.farm.frolov.animals.Goat;
import ru.milandr.courses.farm.frolov.animals.Pig;
import ru.milandr.courses.farm.frolov.goods.Cheese;
import ru.milandr.courses.farm.frolov.goods.Meat;
import ru.milandr.courses.farm.frolov.goods.Milk;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        FarmerAbobus tolyanchik = new FarmerAbobus("Толянчик");

        Pig pepa = new Pig("Пепа");
        Goat zuzya = new Goat("Зюзя");
        Cow zorka = new Cow("Зорька");

        tolyanchik.petAnAnimal(pepa);
        tolyanchik.petAnAnimal(zuzya);
        tolyanchik.petAnAnimal(zorka);

        Milk milk = new Milk();
        Cheese cheese = new Cheese();

        Meat meat = (Meat) tolyanchik.collectGoods(pepa);

        tolyanchik.collectGoods(milk);
        tolyanchik.collectGoods(cheese);

        System.out.println("Ждем 5,1 сек, чтобы молоко испортилось");
        Thread.sleep(5100);

        tolyanchik.eatProduct(milk);
        tolyanchik.eatProduct(cheese);
        tolyanchik.eatProduct(meat);

        System.out.println("Ждем еще 2,5 сек, чтобы мясо испортилось");
        Thread.sleep(2500);

        tolyanchik.eatProduct(milk);
        tolyanchik.eatProduct(cheese);
        tolyanchik.eatProduct(meat);

        tolyanchik.petAnAnimal(pepa);
        tolyanchik.petAnAnimal(zuzya);
        tolyanchik.petAnAnimal(zorka);
    }
}

