package hw_3;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        double[] numbers = {3.43, 12.1212, 12.22, 2.29};

        String result = Arrays.toString(numbers)
                              .replace("[", "")
                              .replace("]", "")
                              .replace(",",";");

                System.out.println(result);
    }
}
