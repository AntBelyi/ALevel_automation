package hw_3;
import java.util.Arrays;
public class Task1 {
public static void main(String[] args) {
    //task1
    double[] array = {3.43, 12.1212, 12.22, 2.29};
    System.out.println(Arrays.toString(array));
    for(double example : array ){
    String result = example + ";";
    System.out.println(result);
    }

    //task2
    String sentence = "Мама мила раму";
    System.out.println(sentence);
    String[] word = sentence.split( " ");
    for (String result : word ){
    System.out.println(result);
    }

    //task3
    String task = "Я хочу перенесення рядків";
    System.out.println(task);
    System.out.println(task.replace(" ","\n"));
}
}
