package hw_5.Task3;

public class Point {

    public int x;

    public int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void info() {
        System.out.println("Point coordinates: x = " + x + ", y = " + y);
    }

    @Override
    public String toString() {
        return "Point{x=" + x + ", y=" + y + "}";
    }

}
