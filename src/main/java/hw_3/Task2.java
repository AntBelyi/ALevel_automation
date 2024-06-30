package hw_3;

public class Task2 {
    public static void main(String[] args) {

        String sentence = "Mother washed hands.";
        String[] wordsArray = sentence.split(" ");
        for (String word : wordsArray) {

            System.out.println(word);
        }
    }
}