package hw_1_1;

public class Task2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println("a=" + a + " "  + "b=" + b);
        int helper = a;
        a = b;
        b = helper;
        System.out.println("a="+ a + " " + "b=" + b);
    }
}