package hw_3;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        String line = "Hello world!";
        char firstChar = line.charAt(0);
        char lastChar = line.charAt(line.length() - 1);

        System.out.println("The first symbol: " + firstChar);
        System.out.println("The last symbol: " + lastChar);

        String word = "World";
        char[] worldArray = word.toCharArray();

        System.out.println(Arrays.toString(worldArray));
        char a = worldArray[worldArray.length - 2];
        System.out.println("The last element of the array: " + a);

    }
}
