package HW_7;

public class Circle extends Figure {
    private double radius;
    final double PI = 3.14;

    public Circle(double radius){
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
        return "Circle " + super.toString();
    }
}