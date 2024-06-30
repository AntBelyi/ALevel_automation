package hw_3;

public class Task4 {
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = numbers[i] + 1;
            }

            for (int number : numbers) {
                System.out.println(number);
            }
        }
    }