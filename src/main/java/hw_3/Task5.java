package hw_3;

public class Task5 {
    public static void main(String[] args) {
        double[] numbers = {1.1, 2.2, 3.3, 4.4, 5.5};

        System.out.println("Array1:");

        for (double number : numbers) {
            System.out.println(number);
        }

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }

        System.out.println("Array2:");
        for (double number : numbers) {
            System.out.println(number);
        }
    }
}