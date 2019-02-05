package O_ArrayList;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 123456789);
        hashMap.put("B", 234567891);
        hashMap.put("C", 345678912);
        hashMap.put("D", 456789123);
        hashMap.put("E", 567891234);

        Set<Map.Entry<String, Integer>> set = hashMap.entrySet();

        for (Map.Entry<String, Integer> me: set){
            System.out.println(me.getKey() + " " + me.getValue());
        }

        int value = hashMap.get("C");
        hashMap.put("C", value + 1002254);
        System.out.println("New C " + hashMap.get("C"));
    }
}
