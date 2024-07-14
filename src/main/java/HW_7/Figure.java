package HW_7;

abstract class Figure {
    public abstract double getPerimeter();

    public abstract double getArea();

    @Override
    public String toString() {
        return "Perimeter: " + getPerimeter() + ", Area: " + getArea();
    }
}