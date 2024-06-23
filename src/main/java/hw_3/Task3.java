package hw_3;

public class Task3 {
    public static void main(String[] args) {
        // ДЗ Масиви та рядки
        /*Створіть рядок "Hello world!"
        - Виведіть перший символ
        - Виведіть останній символ
        - Створіть масив символів, покладіть туди усі символи слова world
        - Вивести масив у консоль
        - Вивести в консоль передостанній елемент масиву, не використовуючи прямий доступ за індексом (arr[3] – не згодиться)
        */
        String hello = "Hello World!";
        char first = hello.charAt(0);
        char last = hello.charAt(hello.length() - 1);
        System.out.println(first);
        System.out.println(last);
        char[] world = {'w','o','r','l','d'};
        System.out.println(world);
        System.out.println(world[world.length-2]);
    }
}