package hw_3;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        //Створіть будь-який двовимірний масив, заповніть будь-якими даними та виведіть у консоль
        int[][] twoDimensionalArray = {{3, 14, 34, 12}, {4, 18, 45, 2}, {3, 5, 0, 32}, {0, 3, 2, 4}};
        for (int[] value : twoDimensionalArray) {
            System.out.println(Arrays.toString(value));
        }
    }
}
