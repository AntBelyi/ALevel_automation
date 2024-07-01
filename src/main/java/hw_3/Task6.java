package hw_3;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        byte a = 12;
        int b = 210;
        long c = 3113;

        int[] array = new int[3];
        array[0] = a;
        array[1] = b;
        array[2] = (int) c;

        System.out.println(Arrays.toString(array));
    }
}