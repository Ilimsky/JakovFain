package L_Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FishMaster {
    public static void main(String[] args) {
        Fish myFish = new Fish(20);
        String feetString = "";
        int feet;
        BufferedReader stdn = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Готова к погружению. На какую глубину?");
            try {
                feetString = stdn.readLine();
                if (feetString.equals("Q")){
                    System.out.println("Пока!");
                    System.exit(0);
                }else {
                    feet = Integer.parseInt(feetString);
                    myFish.dive(feet);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
