package hw_5;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void info() {
        System.out.println("Point(" + x + ", " + y + ")");
    }
}