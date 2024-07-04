package hw_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Task3 {
    public static void main(String[] args) {
        String text = "Роняє ліс багряний свій убір,\n"
                    +"Срібне мороз, що в'януло поле,\n"
                    + "Прогляне день ніби мимоволі\n"
                    + "І сховається за край окружних гір.";
        System.out.println("Text:\n" + text);

        String searchTerm = "про";
        int count = 0;
        int index = 0;

        while ((index = text.toLowerCase().indexOf(searchTerm, index)) != -1) {
            count++;
            index += searchTerm.length();
        }
        System.out.println("Number of 'про': " + count);
    }
}