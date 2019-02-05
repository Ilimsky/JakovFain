package O_ArrayList;

import java.util.ArrayList;

public class FishTank{
    public static void main(String[] args) {
        ArrayList fishTank = new ArrayList();
        Fish theFish;
        Fish aFish = new Fish(20);
        aFish.color = "красную";
        aFish.weight = 2;
        fishTank.add(aFish);

        aFish = new Fish(10);
        aFish.color = "зеленую";
        aFish.weight = 5;
        fishTank.add(aFish);

        int fishCount = fishTank.size();

        for (int i = 0; i <fishCount; i++) {
            theFish = (Fish) fishTank.get(i);

            System.out.println("Поймал " + theFish.color +
                    " рыбу с весом " + theFish.weight + " кг. Глубина: " + theFish.currentDepth);
        }
    }
}
