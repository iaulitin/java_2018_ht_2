package ru.milandr.courses.farm.frolov;

import ru.milandr.courses.farm.frolov.animals.Goat;
import ru.milandr.courses.farm.frolov.animals.Pig;
import ru.milandr.courses.farm.frolov.animals.Cow;
import ru.milandr.courses.farm.frolov.goods.Cheese;
import ru.milandr.courses.farm.frolov.goods.Meat;
import ru.milandr.courses.farm.frolov.goods.Milk;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        FarmerAbobus abobus = new FarmerAbobus("Толик");
        Pig pepa = new Pig("Пепа");
        Goat pavlik = new Goat("Павлик");
        Cow zuzya = new Cow("Зюзя");
        Meat meat = new Meat(pepa);
        Milk milk = new Milk(zuzya);
        Cheese cheese = new Cheese(pavlik);
        abobus.collectGoods(meat);
        abobus.collectGoods(milk);
        abobus.collectGoods(cheese);
        System.out.println("Ждем 11 секунд, чтобы молоко испортилось");
        Thread.sleep(11000);
        abobus.eatProduct(meat);
        abobus.eatProduct(milk);
        abobus.eatProduct(cheese);
        abobus.petAnAnimal(pepa);
        abobus.petAnAnimal(pavlik);
        abobus.petAnAnimal(zuzya);
    }
}
