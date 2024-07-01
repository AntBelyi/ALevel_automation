package hw_4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string of integers separated by commas:");
        String input = scanner.nextLine();

        String[] numberStrings = input.split(",");
        int[] numbers = new int[numberStrings.length];

        for (int i = 0; i < numberStrings.length; i++) {
            numbers[i] = Integer.parseInt(numberStrings[i]);
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int number : numbers) {
            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        System.out.println("Мінімальне число: " + min);
        System.out.println("Максимальне число: " + max);

    }
}
