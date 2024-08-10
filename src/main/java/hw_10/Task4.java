package hw_10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task4 {
    public static void main(String[] args) {
        Set<Integer> numberSet = new HashSet<>();
        numberSet.add(1);
        numberSet.add(2);
        numberSet.add(6);
        numberSet.add(9);
        numberSet.add(3);
        numberSet.add(5);
        numberSet.add(8);
        numberSet.add(4);

        System.out.println("Set of Elements:");

        for (Integer number : numberSet) {
            System.out.println(number);
        }

        List<Integer> numberList = new ArrayList<>(numberSet);

        System.out.println("\nList of Elements:");
        for (Integer number : numberList) {
            System.out.println(number);
        }

        numberList.clear();

        System.out.println("\nList after deleting: " + numberList.size());
    }
}