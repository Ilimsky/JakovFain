package O_ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList friends = new ArrayList();
        friends.add("Елена");
        friends.add("Анна");
        friends.add("Николай");
        friends.add("Сергей");

        int friendsCount = friends.size();

        for (int i = 0; i <friendsCount; i++) {
            System.out.println("Друг №" + i + " это " + friends.get(i));
        }
    }
}
