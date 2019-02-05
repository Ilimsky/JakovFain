package K_Overload;

public class FishMaster {
    public static void main(String[] args) {
        Fish myFish = new Fish(20);
        myFish.dive(2);
        myFish.dive();
        myFish.dive(97);
        myFish.dive(3);
        myFish.sleep();

    }
}
