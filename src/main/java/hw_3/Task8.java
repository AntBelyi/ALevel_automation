package hw_3;

public class Task8 {
    public static void main(String[] args) {
        String sentence = "Hello world!";

        char firstChar = sentence.charAt(0);
        System.out.print("First symbol: " + firstChar + "\n");

        char lastChar = sentence.charAt(sentence.length() - 1);
        System.out.print("Last symbol: " + lastChar + "\n");

        char[] charArray = sentence.substring(6, 11).toCharArray();

        System.out.print("Array of symbols: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.print("\n");

        char secondLastChar = charArray[charArray.length - 2];
        System.out.print("Second last symbol: " + secondLastChar + "\n");
    }
}