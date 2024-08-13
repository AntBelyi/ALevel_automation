package hw_5.myCity;

import hw_5.myClass.MyInt;

public class MainProgram {
    public static void main(String[] args) {

        MyInt a1 = new MyInt(3);
        MyInt a2 = a1;
        System.out.println("a1 : " + a1.x);
        System.out.println("a2 : " + a2.x);

        a1.x = 55;
        System.out.println("a1 : " + a1.x);
        System.out.println("a2 : " + a2.x);
    }
}
