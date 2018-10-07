package Bolodurin;

public class Cacao implements Good{

    boolean statusFresh;
    int timeOfLife;
    static int timeOfFresh;


    public Cacao(int freshTime){
        statusFresh = true;
        timeOfLife = 0;
        timeOfFresh = freshTime;
    }

    @Override
    public void goRotten() {
        statusFresh = false;
    }

    public void passDay(){
        timeOfLife++;
    }
}
