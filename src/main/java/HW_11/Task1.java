package HW_11;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Olga", 22);
        map.put("Olena", 34);
        map.put("Artem", 25);
        map.put("Viktor", 50);
        map.put("Vika", 18);
        map.put("Valeria", 23);
        map.put("Tim", 15);
        map.put("Anna", 20);
        map.put("John", 60);
        map.put("Ursula", 42);
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.entrySet());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Person's name:" + " " + entry.getKey() + "," + " " + "Age:" + " " + entry.getValue());
        }
    }
}