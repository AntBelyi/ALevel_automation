package hw_3;

import java.util.Arrays;
public class Task1 {
    public static void main(String[] args) {
        double[] numbers = {3.43, 12.1212, 12.22, 2.29};
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            result.append(numbers[i]);
            if (i < numbers.length - 1) {
                result.append(";");
            }
        }
        System.out.println(result.toString());
    }
}