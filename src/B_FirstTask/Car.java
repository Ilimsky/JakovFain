package B_FirstTask;

public class Car {

    int distance;

    public void start(){
        System.out.println("Start");
    }

    public void stop(){
        System.out.println("Stop");
    }

    public int drive(int howlong){
        return distance = howlong * 60;
    }
}
