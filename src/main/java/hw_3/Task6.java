package hw_3;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        //Створіть 3 змінних таких типів: byte, int, long. Створіть масив типу int. Спробуйте туди покласти змінні.
        byte a = 12;
        int b = 210;
        long c = 3113;

       // int[] = {a, b, c} error, Java does not allow mixing primitive types in arrays directly

        Object[] differentTypes = {a, b, c};

        System.out.println(Arrays.toString(differentTypes));
    }
}