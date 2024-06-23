package hw_3;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        //ДЗ масиви
        //Створіть масив із цілих чисел і помістіть відразу 10 значень. Пройдіться ними і змініть значення.
        int[] array = new int[10];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        array[6] = 7;
        array[7] = 8;
        array[8] = 9;
        array[9] =10;
        System.out.println(Arrays.toString(array));
        //Створіть масив із дробових чисел (5 елементів)
        double[] array_1 = new double[5];
        System.out.println(Arrays.toString(array_1));
        //Створіть 3 змінних таких типів: byte, int, long. Створіть масив типу int. Спробуйте туди покласти змінні.
        byte a = 43;
        int b = 13;
        long c = 123;
        int[] array_2 = new int[3];
        array_2[0] = a;
        array_2[1] = b;
        array_2[2] = (int) c;
        System.out.println(Arrays.toString(array_2));
        //Створіть будь-який двовимірний масив, заповніть будь-якими даними та виведіть у консоль
        int[][] array_3 = {{1,2,3,4,5}, {2,3,4,5,6}};
            for (int[] value : array_3) {
                System.out.println(Arrays.toString(value));
            }

    }
}