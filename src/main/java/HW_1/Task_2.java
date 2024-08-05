package HW_1;

public class Task_2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println("a до = " + a);
        System.out.println("b до = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a після = " + a);
        System.out.println("b після = " + b);
    }
}
