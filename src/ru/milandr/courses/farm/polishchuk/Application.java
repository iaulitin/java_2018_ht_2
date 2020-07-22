package ru.milandr.courses.farm.polishchuk;

import ru.milandr.courses.farm.polishchuk.animals.*;
import ru.milandr.courses.farm.polishchuk.farmers.*;
import ru.milandr.courses.farm.Good;
import ru.milandr.courses.farm.*;

public class Application {
    public static void main(String[] args) {
        Farmer mcDonald = new Farmer("Mc'Donald");
        Cock instein = new Cock("Cock'instein", 7.5, "male");
        Cock ryaba = new Cock("Ryaba", 5., "female");
        Cow boy = new Cow("Boy", 700., "male");
        Cow mooMoo = new Cow("MooMoo", 216., "female");
        Good producedGood;

        mcDonald.petAnAnimal(instein);
        producedGood = instein.produceGoods();
        mcDonald.collectGoods(producedGood);
        mcDonald.eatProduct(producedGood);

        mcDonald.petAnAnimal(instein);
        producedGood = instein.produceGoods();
        mcDonald.collectGoods(producedGood);
        mcDonald.eatProduct(producedGood);

        mcDonald.petAnAnimal(ryaba);
        producedGood = ryaba.produceGoods();
        mcDonald.collectGoods(producedGood);
        mcDonald.eatProduct(producedGood);
        mcDonald.eatProduct(producedGood);

        mcDonald.petAnAnimal(ryaba);
        producedGood = ryaba.produceGoods();
        producedGood.goRotten();
        mcDonald.collectGoods(producedGood);
        mcDonald.eatProduct(producedGood);

        mcDonald.petAnAnimal(ryaba);
        ryaba.kill();
        producedGood = ryaba.produceGoods();
        mcDonald.collectGoods(producedGood);
        mcDonald.eatProduct(producedGood);

        mcDonald.petAnAnimal(boy);
        producedGood = boy.produceGoods();
        mcDonald.collectGoods(producedGood);
        mcDonald.eatProduct(producedGood);

        for (int i = 0; i < 10; i++) {
            mcDonald.petAnAnimal(mooMoo);
            producedGood = mooMoo.produceGoods();
            mcDonald.collectGoods(producedGood);
            mcDonald.eatProduct(producedGood);
        }
    }
}