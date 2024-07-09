package hw_5.myCity;

import hw_5.myClass.Point;

public class Main {
    public static void main(String[] args) {

        Point[] points = new Point[4];
        points[0] = new Point(2, 8);
        points[1] = new Point(5, 1);
        points[2] = new Point(10, 4);
        points[3] = new Point(9, 4);

        for (int i = 0; i < points.length; i++) {
            points[i].Info();
            System.out.println(points[i]);
            if (points[i].x % 2 == 0 && points[i].y % 2 == 0) {
                points[i].Info();
                System.out.println(points[i]);

            }

        }

    }

}