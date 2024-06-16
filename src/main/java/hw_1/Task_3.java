package hw_1;

public class Task_3 {
    public static void main(String[] args)
    {
        int a =5;
        int b =3;

        System.out.println(a);
        System.out.println(b);
//if we can use numbers
    /*    b = b + 2;
          a = b - 2;

        System.out.println(a);
        System.out.println(b); */
//if we can not use numbers

        a = a + b; //5+3=8
        b = a - b; //8-3=5
        a = a - b; // 8-5=3

        System.out.println(a);
        System.out.println(b);

    }
}