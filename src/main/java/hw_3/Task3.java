package hw_3;

public class Task3 {
    public static void main(String[] args) {
        // HW Arrays and Strings
        /*Create the string "Hello world!"
        - Print  the first character
        - Print the last character
        -  Create an array of characters, put all the characters of the word "world" into it
        - Print the array to the console
        - Print the second-to-last element of the array without using direct index access (arr[3] is not allowed)
        */
        String hello = "Hello World!";
        char first = hello.charAt(0);
        char last = hello.charAt(hello.length() - 1);
        System.out.println(first);
        System.out.println(last);
        int start = 6;
        int end = 11;
        char[] dst = new char[end - start];
        hello.getChars(start, end, dst, 0);
        System.out.println(dst);
        System.out.println(dst[dst.length -2]);
    }
}