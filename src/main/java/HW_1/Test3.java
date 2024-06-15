package HW_1;

public class Test3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        a = a + b;
        b = a - b;
        a = a - b;
        a = a + b - (b = a);
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
        System.out.println("a="+ a + " "  + "b=" + b);
    }
}
