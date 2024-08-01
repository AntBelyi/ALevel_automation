package hw_13;

import java.io.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть назву файлу:");
        String fileName = scanner.nextLine();

        String basePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "java" + File.separator + "hw_13";

        FileHandler fileHandler = new FileHandler(basePath + File.separator + fileName + ".txt");

        System.out.println("Введіть текст, який ви хочете зберегти у файл:");
        String textToSave = scanner.nextLine();

        try {
            fileHandler.writeValueToFile(textToSave);
            System.out.println("Текст успішно збережено у файл.");
        } catch (IOException e) {
            System.out.println("Помилка при записі у файл: " + e.getMessage());
            return;
        }

        System.out.println("Введіть слово чи фразу для пошуку у файлі:");
        String valueToSearch = scanner.nextLine();

        try {
            int findText = fileHandler.fileContainsValue(valueToSearch);
            if (findText > 0) {
                System.out.println("Таке слово чи підстрока зустрічається " + findText + " разів.");
            } else {
                System.out.println("Такого слова чи фрази не існує у файлі.");
            }
        } catch (IOException e) {
            System.out.println("Помилка при читанні з файлу: " + e.getMessage());
        }
    }
}
