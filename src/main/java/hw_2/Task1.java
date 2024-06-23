package hw_2;

public class Task1 {
    public static void main(String[] args) {
        // Arithmetic operations
        // +
        int a = 5;
        int b = 2;
        int result1 = a + b;

        System.out.println(result1);

        // -
        int c = 5;
        int d = 2;
        int result2 = c - d;

        System.out.println(result2);

        // *
        int q = 5;
        int w = 2;
        int result3 = q * w;

        System.out.println(result3);

        // /
        double e = 5.0;
        double r = 2.0;
        double result4 = e / r;

        System.out.println(result4);

        // %
        int t = 5;
        int y = 2;
        int result5 = t % y;

        System.out.println(result5);

        // ++ pre
        int u = 5;
        int i = ++u;

        System.out.println(u);
        System.out.println(i);

        // ++ post
        int o = 5;
        int p = o++;

        System.out.println(o);
        System.out.println(p);

        // -- pre
        int s = 5;
        int f = --s;

        System.out.println(s);
        System.out.println(f);

        // -- post
        int g = 5;
        int h = g--;

        System.out.println(g);
        System.out.println(h);

        // Conditional expressions
        // ==
        int j = 6;
        int k = 8;
        boolean l = j == k;

        System.out.println(l);

        // !=
        int z = 6;
        int x = 8;
        boolean v = z != x;

        System.out.println(v);

        // <
        int n = 6;
        int m = 8;
        boolean aa = n < m;

        System.out.println(aa);

        // >
        int bb = 6;
        int cc = 8;
        boolean dd = bb > cc;

        System.out.println(dd);

        // |
        boolean ee = true;
        boolean ff = false;
        boolean qq = ee | ff;

        System.out.println(qq);

        // &
        boolean ww = true;
        boolean rr = false;
        boolean tt = ww & rr;

        System.out.println(tt);

        // ^
        boolean yy = true;
        boolean uu = false;
        boolean ii = yy ^ uu;

        System.out.println(ii);

        // ||
        boolean pp = true;
        boolean oo = false;
        boolean ss = pp | oo;

        System.out.println(ss);

        // &&
        boolean gg = true;
        boolean hh = false;
        boolean kk = gg && hh;

        System.out.println(kk);

        // Assignment operations

        int aaa = 30;
        int bbb = 50;
        int ccc = 0;
        ccc = bbb;
        ccc += bbb;
        ccc %= bbb;
        ccc &= bbb;
        ccc >>= aaa;
        ccc |= bbb;
        ccc ^= bbb;
        ccc <<= bbb;
        ccc -= bbb;
        ccc *= bbb;

        System.out.println(ccc);


    }
}
