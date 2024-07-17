package HW_5;

public class Main {
    public static void main(String[] args) {
        Point[] points = new Point[4];
        points[0] = new Point(2, 2);
        points[1] = new Point(3, 7);
        points[2] = new Point(4, 6);
        points[3] = new Point(5, 7);
        System.out.println();
        for (Point point : points) {
            point.info();
        }
        System.out.println();
        for (Point point : points) {
            if (point.x % 2 == 0 && point.y % 2 == 0) {
                point.info();
            }
        }
    }
}