package hw_3;
import java.util.Arrays;
public class task3 {
    public static void main(String[] args) {
    String hello = "Hello world!";
    System.out.println(hello.length());
    char first = hello.charAt(0);
    char last = hello.charAt(hello.length()-1);
    System.out.println(first);
    System.out.println(last);
    char[] sentence = hello.toCharArray();
    System.out.println(Arrays.toString(sentence));
    char[] word = hello.substring(6,11).toCharArray();
    System.out.println(Arrays.toString(word));
    System.out.println(word[word.length-2]);
    }
}
