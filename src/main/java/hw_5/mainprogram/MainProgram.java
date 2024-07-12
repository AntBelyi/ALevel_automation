package hw_5.mainprogram;
import hw_5.myint.MyInt;

public class MainProgram {
    public static void main(String[] args) {
        MyInt a1 = new MyInt(3);
        MyInt a2 = a1;

        System.out.println("a1.x: " + a1.x);
        System.out.println("a2.x: " + a2.x);

        a1.x = 5;

        System.out.println("a1.x: " + a1.x);
        System.out.println("a2.x: " + a2.x);
    }
}