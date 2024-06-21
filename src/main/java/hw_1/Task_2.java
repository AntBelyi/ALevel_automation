package hw_1;

public class Task_2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(a);
        System.out.println(b);

        int helper = b;
        b = a;
        a = helper;
        System.out.println(a);
        System.out.println(b);
    }
}