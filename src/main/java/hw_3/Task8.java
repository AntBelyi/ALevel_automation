package hw_3;

public class Task8 {
        public static void main(String[] args) {
            String sentence = "Hello world!";

            char firstChar = sentence.charAt(0);
            System.out.println("First symbol: " + firstChar);

            char lastChar = sentence.charAt(sentence.length() - 1);
            System.out.println("Last symbol: " + lastChar);

            char[] charArray = sentence.substring(6, 11).toCharArray();

            System.out.print("Array of symbols: ");

            for (char c : charArray) {
                System.out.print(c + " ");
            }

            System.out.println();

            char secondLastChar = charArray[charArray.length - 2];
            System.out.println("Second last symbol: " + secondLastChar);
        }
    }

