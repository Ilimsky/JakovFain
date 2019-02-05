package O_ArrayList;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HashMapRandom {
    public static void main(String[] args) {
        Random random = new Random(36);
        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i <100; i++) {
            int number = random.nextInt(10);
            Integer frequency = hashMap.get(number);
            hashMap.put(number, frequency == null ? 1 : frequency + 1);
        }
        System.out.println(hashMap);
    }
}
