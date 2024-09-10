package hw_13;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter file's name: ");
        String fileName = scanner.nextLine();

        FileHandler fileHandler = new FileHandler(fileName);

        System.out.print("Enter text to write: ");
        String textToWrite = scanner.nextLine();
        fileHandler.writeValueToFile(textToWrite);

        System.out.print("Enter a word or phrase to find in file: ");
        String searchValue = scanner.nextLine();

        int occurrences = fileHandler.fileContainsValue(searchValue);
        if (occurrences > 0) {
            System.out.println("You can find such word or phrase " + occurrences + " times.");
        } else {
            System.out.println("There isn't such word or phrase in the file.");
        }
    }
}