package HW_5.main;

import HW_5.MyInt.MyInt;

public class MainProgram {
    public static void main(String[] args) {
        MyInt a1 = new MyInt(3);
        MyInt a2 = a1;
        System.out.println(a1.x);
        System.out.println(a2.x);
        a1.x = 5;
        System.out.println(a1.x);
        System.out.println(a2.x);
    }
}