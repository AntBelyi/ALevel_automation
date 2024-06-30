package hw_3;

public class Task2 {
    public static void main(String[] args) {
        //Створіть змінну із рядком “Мама мила раму”. Створіть масив зі всіх слів, які зустрічаються у цьому рядку.
        // (Погляньте на методи рядка та подумайте, який метод можна використовувати)
        String sentence = "Mother was washing the window";
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1) {
                System.out.println(words[i]);
            } else {
                System.out.println(words[i] + " ");
            }
        }
    }
}
