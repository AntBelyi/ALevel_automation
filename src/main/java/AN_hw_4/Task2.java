package AN_hw_4;

import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a series of integers separated by spaces:");
        String input = scanner.nextLine();
        String[] number = input.split(" ");
        int[] numbers = new int[number.length];
        for (int i = 0; i < number.length; i++) {
            numbers[i] = Integer.parseInt(number[i]);
        }
        int minValue = numbers[0];
        int maxValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        System.out.println("Minimum value: " + minValue);
        System.out.println("Maximum value: " + maxValue);
    }
}