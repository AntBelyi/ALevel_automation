package hw_3;
import java.util.Arrays;
public class Task2 {
    public static void main(String[] args) {
        //task1
        int[] example = new int[10];
        System.out.println(Arrays.toString(example));
        example[0] = 1;
        example[1] = 15;
        example[2] = 7;
        example[3] = 8;
        example[4] = 5;
        example[5] = 11;
        example[6] = 33;
        example[7] = -5;
        example[8] = 17;
        example[9] = 50;
        System.out.println(Arrays.toString(example));
        //task2
        double[] array= new double[5];
        System.out.println(Arrays.toString(array));
        //task3
        byte a = 7;
        int b = 10;
        long c = 34;
        int[] values = new int[3];
        values[0] = a;
        values[1] = b;
        values[2] = (int) c;
        System.out.println(Arrays.toString(values));
        //task4
        int[][] arrayTwins = new int[3][2];
        System.out.println(Arrays.deepToString( arrayTwins));
        arrayTwins[0][1] = 17;
        arrayTwins[2][0] = 5;
        arrayTwins[1][1] = 24;
        arrayTwins[0][0] = 14;
        System.out.println(Arrays.deepToString(arrayTwins));
    }
}
