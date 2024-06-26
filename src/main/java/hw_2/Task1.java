package hw_2;

public class Task1 {
    public static void main(String[] args) {
        // +
        int a = 15;
        int b = 2;
        int c = a + b;
        int d = 4 + c;
        System.out.println(c);
        System.out.println(d);
        // -
        a = 12;
        b = 5;
        c = a - b;
        d = a - c;
        System.out.println(c);
        System.out.println(d);
        // *
        a = 5;
        b = 2;
        c = a * b;
        d = a * b * 2;
        System.out.println(c);
        System.out.println(d);
        //  /
        a = 12;
        b = 3;
        c = a / b;
        System.out.println(c);
        double j= 20.5 / 4;
        System.out.println(j);
        //  %
        a = 45;
        b = 15;
        c = a % b;
        System.out.println(c);
        d = 17 % 3;
        System.out.println(d);
        // ++a
        a = 5;
        b = ++a;
        System.out.println(a);
        System.out.println(b);
        // a++
        a = 7;
        b = a++;
        System.out.println(a);
        System.out.println(b);
        // --a
        a = 17;
        b = --a;
        System.out.println(a);
        System.out.println(b);
        // a--
        a = 12;
        b = a--;
        System.out.println(a);
        // priority
        a = 6;
        b = 9;
        c = a + b * 3;
        System.out.println(c);
        // true/false operators
        // ==
        a = 10;
        b = 2;
        boolean k = a == b;
        System.out.println(k);
        // !
        a = 20;
        b = 7;
        boolean k1 = a != b;
        System.out.println(k1);
        // < >
        a = 17;
        b = 34;
        boolean k2 = a < b;
        boolean k3 = a > b;
        System.out.println(k2);
        System.out.println(k3);
        // <= >=
        a = 25;
        b = 17;
        System.out.println(a <= b);
        System.out.println(a >= b);
        System.out.println(a <= 17);
        System.out.println(25 <= b);
        // && ||
        a = 15;
        b = 58;
        boolean a1 = 15 < 58 || 58 < 15;
        boolean a2 = 15 <= 58 || 58 <= 15;
        System.out.println(a1);
        System.out.println(a2);
        boolean a3 = 15 < 58 && 15 > 58;
        boolean a4 = 58 > 15 && 15 < 58;
        System.out.println(a3);
        System.out.println(a4);
        // операции пресваивания
        // =
        a = 13;
        b = a;
        System.out.println(b = a);
        // += -=
        a = 25;
        b = 10;
        System.out.println(b += a);
        a = 25;
        b = 10;
        System.out.println(b -= a);
        // *= /=
        a = 5;
        b = 3;
        System.out.println(b *= a);
        a = 50;
        b = 5;
        c = a /= b;
        System.out.println(c);
        // %
        a = 17;
        b = 5;
        a %= b;
        System.out.println(a);
    }
}
