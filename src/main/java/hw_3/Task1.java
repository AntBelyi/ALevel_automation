package hw_3;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        //task1
        double[] array = {3.43, 12.1212, 12.22, 2.29};
        System.out.println(Arrays.toString(array));
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            str.append(array[i]);
            if (i < array.length - 1) {
                str.append(";");
                System.out.println(str.toString());
            }
        }
        //task2
        String sentence = "Мама мила раму";
        System.out.println(sentence);
        String[] word = sentence.split(" ");
        for (String result : word) {
            System.out.println(result);
        }

        //task3
        String textSentence = "Я хочу перенесення рядків";
        System.out.println(textSentence);
        System.out.println(textSentence.replace(" ", "\n"));
    }
}
