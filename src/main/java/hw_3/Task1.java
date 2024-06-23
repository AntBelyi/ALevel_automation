package hw_3;

import java.util.Arrays;
import java.util.StringJoiner;

import static java.awt.SystemColor.text;
public class Task1 {
    public static void main(String[] args) {
        // ДЗ рядки
        //Виведіть у консоль один рядок з числами з масиву (які ми створювали в 1-му завданні), розділеними “;”
        int[] array = {1, 2, 3, 4, 5};
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);
            if (i < array.length - 1) {
                result.append(";");
            }
        }
        System.out.println(result.toString());
        // Створіть змінну із рядком “Мама мила раму”.
        //Створіть масив зі всіх слів, які зустрічаються у цьому рядку.
        String message = "Mother washed the frame";
        String[] words = message.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
        /*Створіть рядок "Я хочу перенесення рядків."
        Замініть всі символи пробілу в рядку на символи перенесення рядків та виведіть у консоль.*/
        String str = "I want line breaks";
        String replacedstr = str.replace(" ", "/");
        System.out.println(replacedstr);
    }
}