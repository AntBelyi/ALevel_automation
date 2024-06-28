package HW_2;

public class App {
    public static void main(String[] args) {
    //arithmetic operations
        // +
        int a = 5;
        int b = 6;
        int c = a + b; // 11
        // -
        int aa = 8;
        int bb = 2;
        int cc = aa - bb; // 6
        // *
        int s = 15;
        int k = 2;
        int f = s * k; // 30
        // /
        double p=40/2.5; //16.0
        // remainder of two numbers
        int q = 32 % 5; // 2 (32 - 5 * 6 = 2)
        // prefix increment (First increments the value of the variable by 1, and then assigns the value)
        int m = 3;
        int n = ++m;
        System.out.println(m); // 4
        System.out.println(n); // 4
        //postfix increment (First assigns the value, and then increments the value of the variable by 1)
        int e = 5;
        int h = e++;
        System.out.println(e); // 6
        System.out.println(h); // 5
        /* prefix decrement (First decrements the value of the variable by 1, and then assigns the value)
        postfix decrement (First assigns the value, and then decrements the value of the variable by 1)
         */
        //arithmetic operator precedence
        int r = 9;
        int t = 2;
        int j = r + 6 * --t;
        System.out.println(j); // 15 (t=1; 6*1=6; 9+6=15)
        // Conditional expressions
        int a1 = 8;
        int b1 = 4;
        boolean c1 = a1 == b1; // false
        boolean d1 = a1 == 8; // true

        int a2 = 10;
        int b2 = 12;
        boolean c2 = a2 != b2; // true
        boolean d2 = a2 != 10; // false

        int a3 = 15;
        int b3 = 9;
        boolean c3 = a3 < b3; // false

        int a4 = 20;
        int b4 = 4;
        boolean c4 = a4 > b4; // true
    // >= true, True if the first operand is greater than or equal to the second, otherwise false
        boolean as = 120 >= 10; // true
        boolean v = 10 >= 4; // true
        boolean d5 = 2 >= 20; // false
    // logical operations
        boolean app = (7 < 8) | (4 < 3);
        System.out.println(app); // true  (c=true if or a or b = true)
       //c = true, if  a and b = true, if not c = false)
        boolean app_1 = (4 < 6) & (7 < 9);
        boolean app_2 = (4 > 6) & (7 < 9);
        System.out.println(app_1); //  true
        System.out.println(app_2); //  false
        int x = 3;
        int y = 4;
        System.out.println(x + y);
        System.out.println(" " + x + y);
    }
}