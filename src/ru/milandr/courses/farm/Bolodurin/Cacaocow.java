package Bolodurin;

public class Cacaocow implements Animal {

    @Override
    public void produceSound() {
        System.out.println("CacaoMooo");
    }

    @Override
    public Good produceGoods() {
        Cacao coupleCacao = new Cacao(10);
        return coupleCacao;
    }
}
