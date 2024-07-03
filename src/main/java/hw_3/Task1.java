package hw_3;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        //task1
        double[] array = {3.43, 12.1212, 12.22, 2.29};
        System.out.println(Arrays.toString(array));
        System.out.print(array[0]);
        for (int i = 1; i < array.length; i++) {
            System.out.print(";" + array[i]);
        }
        System.out.println();


        //task2
        String sentence = "Мама мила раму";
        System.out.println(sentence);
        String[] word = sentence.split(" ");
        for (String result : word) {
            System.out.println(result);
        }

        //task3
        String rescheduled = "Я хочу перенесення рядків";
        System.out.println(rescheduled);
        System.out.println(rescheduled.replace(" ", "\n"));
    }
}
