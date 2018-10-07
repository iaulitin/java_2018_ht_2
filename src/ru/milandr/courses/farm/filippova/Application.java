package ru.milandr.courses.farm.filippova;

public class Application {

    public static void main(String[] args) throws InterruptedException {
       /* ComplexNumber p;
        ComplexNumber c;
        ComplexNumber d;
        ComplexNumber b = new ComplexNumber(3, 4);

        System.out.println(a.calculateModulus());
        System.out.println(b.calculateModulus());
        a.calculateArgument();
        System.out.println(String.format("%.3f", b.calculateArgument()));
        c = (ComplexNumber)b.negate();
        d = (ComplexNumber)b.add(b);
        p = (ComplexNumber)b.divide(c);
        System.out.println(d.getReal()+ "+" +  d.getImage() +  "i");
        System.out.println(p.getReal()+ "+" +  p.getImage() +  "i");
        b.divide(c);
        b.add(c);
       */

        Cow cow = new Cow(10, 2, "Burenka");
        Lama lama = new Lama("grey", 50, false);
        Chicken chicken = new Chicken("simple", 7);
        Chicken.warning(chicken);
        Lama.needFeed(lama);
        Cow.type(cow);

        Farmer farmer = new Farmer();

        farmer.petAnAnimal(cow);
        farmer.collectGoods(chicken.produceGoods());
        farmer.collectGoods(lama.produceGoods());
        farmer.collectGoods(cow.produceGoods());
        farmer.eatProduct(chicken.produceGoods());
        farmer.eatProduct(lama.produceGoods());
        farmer.eatProduct(cow.produceGoods());


    }
}
