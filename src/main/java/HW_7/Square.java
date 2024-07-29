package HW_7;

public class Square extends Figure {
    private float side;

    Square(float side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square " + super.toString();
    }
}