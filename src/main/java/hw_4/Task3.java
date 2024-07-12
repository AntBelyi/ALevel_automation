package hw_4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String text = "Роняє ліс багряний свій убір,\n"
                + "Срібне мороз, що в'януло поле,\n"
                + "Прогляне день ніби мимоволі\n"
                + "І сховається за край окружних гір.";
        System.out.println("Text:\n" + text);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the substring to search for: ");
        String searchTerm = scanner.nextLine().toLowerCase();

        int count = 0;
        int index = 0;

        while ((index = text.toLowerCase().indexOf(searchTerm, index)) != -1) {
            count++;
            index += searchTerm.length();
        }

        System.out.println("Number of '" + searchTerm + "': " + count);
    }
}