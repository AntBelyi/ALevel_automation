package hw_11;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<String, Integer> people = new HashMap<>();

        people.put("Sasha", 30);
        people.put("Natalia", 25);
        people.put("Ivan", 45);
        people.put("Olena", 40);
        people.put("Serhii", 35);
        people.put("Tania", 28);
        people.put("Vova", 50);
        people.put("Mariia", 32);
        people.put("Andrii", 29);
        people.put("Katia", 27);

        System.out.println("Map: " + people);

        System.out.println("Map size: " + people.size());

        for (Map.Entry<String, Integer> entry : people.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
        }
    }
}