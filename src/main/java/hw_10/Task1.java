package hw_10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");

        System.out.println("First list: " + list);

        list.remove(0);
        list.remove(list.size() - 1);
        System.out.println("List after removing elements: " + list);

        list.set(0, "Hello");
        list.set(list.size() - 1, "World");
        System.out.println("List after replacing elements: " + list);

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if (!item.equals("Hello") && !item.equals("World")) {
                iterator.remove();
            }
        }
        System.out.println("List after removing elements that are not equal 'Hello' or 'World': " + list);

        String result = String.join(" ", list);
        System.out.println("Result: " + result);
    }
}