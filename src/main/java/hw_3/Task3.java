package hw_3;

public class Task3 {
    public static void main(String[] args) {
        //Створіть рядок "Я хочу перенесення рядків."
        // Замініть всі символи пробілу в рядку на символи перенесення рядків та виведіть у консоль.
        String lineWords = "Hello, my name is Antonina";
        String lineWrapping = lineWords.replace(" ", "\n");

        System.out.println(lineWrapping);
    }
}
