package O_ArrayList;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemoCat {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Васька", 5);
        hashMap.put("Мурзик", 8);
        hashMap.put("Рыжик", 12);
        hashMap.put("Барсик", 5);

        Set<Map.Entry<String, Integer>> set = hashMap.entrySet();

        for (Map.Entry<String, Integer> me: set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        int value = hashMap.get("Рыжик");
        hashMap.put("Рыжик", value + 3);
        System.out.println("У Рыжика стало " + hashMap.get("Рыжик"));
    }
}
