package hw_3;

public class Task8 {
    public static void main(String[] args) {
        /*Створіть рядок "Hello world!"
                - Виведіть перший символ
                - Виведіть останній символ
                - Створіть масив символів, покладіть туди усі символи слова world
                - Вивести масив у консоль
                - Вивести в консоль передостанній елемент масиву, не використовуючи прямий доступ
                за індексом (arr[3] – не згодиться)
         */

        String line = "Hello world!";
        char firstChar = line.charAt(0);
        char lastChar = line.charAt(line.length() - 1);

        System.out.println("Перший символ: " + firstChar);
        System.out.println("Останній символ: " + lastChar);

        char[] worldArray = {'w', 'o', 'r', 'l', 'd'};
        char a = worldArray[worldArray.length - 2];
        System.out.println("Останній елемент масиву: " + a);
       // System.out.println(Arrays.toString([worldArray.length - 1]);

    }
}
