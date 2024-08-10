package hw_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 3, 9, 2, -11, 8, 6, 9, 45, 54, -789, 7);

        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) + 3);
        }
        System.out.println("List after adding 3 to each element: " + numbers);

        numbers.sort(Collections.reverseOrder());
        System.out.println("List sorted from largest to smallest: " + numbers);
    }
}