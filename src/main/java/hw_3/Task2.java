package hw_3;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        //HW Arrays
        //Create an array of integers and immediately place 10 values in it. Iterate over them and change the values
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
        //Create an array of floating-point numbers (5 elements)
        double[] numbers = new double[5];
        System.out.println(Arrays.toString(numbers));
        //Create 3 variables of the following types: byte, int, long. Create an array of type int. Try to put the variables into the array
        byte a = 43;
        int b = 13;
        long c = 123;
        int[] array_2 = new int[3];
        array_2[0] = a;
        array_2[1] = b;
        array_2[2] = (int) c;
        System.out.println(Arrays.toString(array_2));
        //Create any two-dimensional array, fill it with any data, and print it to the console
        int[][] array_3 = {{1,2,3,4,5}, {2,3,4,5,6}};
            for (int[] value : array_3) {
                System.out.println(Arrays.toString(value));
            }

    }
}