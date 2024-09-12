package hw_11;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Task1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Tanya", 30);
        map.put("Natali", 40);
        map.put("Igor", 45);
        map.put("Svitlana", 35);
        map.put("Ira", 17);
        map.put("Oleksandr", 5);
        map.put("Maria", 19);
        map.put("Dima", 12);
        map.put("Talya", 32);
        map.put("Marina", 54);
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.entrySet());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Person  name is " + " " + entry.getKey() + "," + " " + " and age " + entry.getValue());
        }
    }
}