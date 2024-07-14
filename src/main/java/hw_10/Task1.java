package hw_10;

import jdk.internal.icu.text.UnicodeSet;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");
        System.out.println(list);
        list.remove(0);
        list.remove(list.size() - 1);
        System.out.println(list);
        list.set(0, "Hello");
        list.set(list.size() - 1, "World");
        for (int i = list.size() - 1; i >= 0; i--) {
            String element = list.get(i);
            if (!element.equals("Hello") && !element.equals("World")) {
                list.remove(i);
            }
        }
        String result = String.join(" ", list);
        System.out.println(result);
    }
}