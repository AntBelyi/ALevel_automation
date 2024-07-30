package hw_5.Task3;

public class Main {
    public static void main(String[] args) {
        Point[] points = new Point[4];

        points[0] = new Point(4, 6);
        points[1] = new Point(5, 3);
        points[2] = new Point(8, 12);
        points[3] = new Point(7, 13);

        for (Point point : points) {
            point.info();
        }

        System.out.println("Points with coordinates divisible by 2:");

        for (Point point : points) {
            if (point.x % 2 == 0 && point.y % 2 == 0) {
                point.info();
            }
        }
    }
}
