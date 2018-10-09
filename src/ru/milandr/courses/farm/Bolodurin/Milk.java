package Bolodurin;

public class Milk implements Good{

    boolean statusFresh;
    int timeOfLife;
    static int timeOfFresh;


    public Milk(int freshTime){
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
        if(timeOfLife >= timeOfFresh)
        {
            statusFresh = false;
        }
    }
}
