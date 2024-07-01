package hw_3;

public class Task9 {
    public static void main(String[] args) {
        int a = 3;
        int b = 8;
        a++;
        b--;

        System.out.println("a after postincrement: " + a);
        System.out.println("b after postdecrement: " + b);

        int d = ++b;

        System.out.println("b after preincrement: " + b);
        System.out.println("b after preincrement: " + d);

    }
}
