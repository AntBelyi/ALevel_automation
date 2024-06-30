package hw_3;

public class Task9 {
    public static void main(String[] args) {
        int a = 3;
        int b = 8;
        a++;
        b--;

        System.out.println("a після постінкременту: " + a);
        System.out.println("b після постдекременту: " + b);

        int d = ++b;

        System.out.println("b після преінкременту: " + b);
        System.out.println("b після преінкременту: " + d);

    }
}
