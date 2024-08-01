package hw_7.Figures;

public class Triangle extends Figure{
    public double side1;
    public double side2;
    public double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double getArea() {
        return (side1 + side2 + side3) /2;
    }

    @Override
    public String toString() {
        return "Triangle" + super.toString();
    }
}
