package hw_7.Figures;

public class Circle {
    private static final double PI = 3.14;
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getPerimeter() {
        return 2 * PI * radius;
    }
    public void printPerimeter() {
        System.out.println("Perimeter of the circle with radius " + radius + " cm is: " + getPerimeter() + " cm");
    }
}