package hw_7;

public class Circle2 extends Figure {
    private double radius;
    private static final double PI = 3.14;

    public Circle2(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle: radius = " + radius +
                ", perimeter = " + getPerimeter() +
                ", area = " + getArea();
    }
}