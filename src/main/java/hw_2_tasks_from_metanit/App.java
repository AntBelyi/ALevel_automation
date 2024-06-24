package hw_2_tasks_from_metanit;

public class App {
    public static void main(String[] args) {
        // arithmetic operations
        int a = 7;
        int b = 10;
        int c = a + b;
        int d = 34 - a;
        int x = d - c;

        System.out.println(c);
        System.out.println(d);
        System.out.println(x);

        int y = a * b;
        int f = y / b;
        double k = (double) 10 / 4;

        System.out.println(y);
        System.out.println(f);
        System.out.println(k);

        int h = d % a;
        int l = 55 % 12;

        System.out.println(h);
        System.out.println(l);

        int m = 12;
        int p = ++m;
        int j = m++;

        System.out.println(p);
        System.out.println(m);
        System.out.println(j);

        int r = 16;
        int w = --r;
        int n = w--;
        int i = (r + 2) * --w;

        System.out.println(r);
        System.out.println(w);
        System.out.println(n);
        System.out.println(i);

        // Conditional expressions
        // Comparison operations
       int g = 5;
       int t = 7;
       boolean result = t == 7;
       boolean resultTwo = g == t;
       boolean resultThree = t != 7;
       boolean resultFour = g != t;
       boolean resultFive = g > t;
       boolean resultSix = g >= 5;
       boolean resultSeven = g < 5;
       boolean resultEight = g <= 5;

       System.out.println(result);
       System.out.println(resultTwo);
       System.out.println(resultThree);
       System.out.println(resultFour);
       System.out.println(resultFive);
       System.out.println(resultSix);
       System.out.println(resultSeven);
       System.out.println(resultEight);

       //Logical operations
        boolean a1 = (4 > 1) || (3 > 7);
        boolean a2 = (4 < 1) || (3 > 7);
        boolean a3 = (4 > 1) && (3 > 7);
        boolean a4 = (4 > 1) && (3 < 7);
        boolean a5 = (8 < 4) ^ (4 > 2);
        boolean a6 = (8 > 4) ^ (4 > 2);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(a6);

        //assignment operations
        int b2 = 9;
        b2 += 2;
        b2 *= 2;
        b2 /= 3;

        System.out.println(b2);

    }
}
