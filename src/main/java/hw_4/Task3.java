package hw_4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "Роняє ліс багряний свій убір,\nСрібне мороз, що в'януло поле,\nПрогляне день ніби мимоволі\nІ сховається за край окружних гір.";

        System.out.println("Enter the sequence of letters you want to find in the poem:\n" + text);
        String sequence = scanner.nextLine();

        int count = 0;

        String lowerText = text.toLowerCase();
        String lowerSequence = sequence.toLowerCase();

        for (int i = 0; i <= lowerText.length() - lowerSequence.length(); i++) {
            if (lowerText.substring(i, i + lowerSequence.length()).equals(lowerSequence)) {
                count++;
            }
        }

        System.out.printf("Number of sequences <%s> in the poem: <%d>\n", sequence, count);

    }
}
