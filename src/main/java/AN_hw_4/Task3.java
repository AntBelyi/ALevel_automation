package AN_hw_4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String text = "The forest sheds its crimson attire,\nSilver frost wilts the field,\nThe day peeks in as if by chance\nAnd hides behind the surrounding mountains.";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the substring to search in the text:");
        String substring = scanner.nextLine();
        int count = countSubstrings(text, substring);
        System.out.println("The substring '" + substring + "' occurs " + count + " times in the text.");
    }
    public static int countSubstrings(String text, String substring) {
        int count = 0;
        int textLength = text.length();
        int substringLength = substring.length();
        for (int i = 0; i <= textLength - substringLength; i++) {
            if (text.substring(i, i + substringLength).equalsIgnoreCase(substring)) {
                count++;
            }
        }
        return count;
    }
}