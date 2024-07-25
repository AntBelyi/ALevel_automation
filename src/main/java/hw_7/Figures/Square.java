package hw_7.Figures;

public class Square extends Figure {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getPerimeter() {
        return 4 * sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public String toString() {
        return "Square: side length = " + sideLength +
                ", perimeter = " + getPerimeter() +
                ", area = " + getArea();
    }
}