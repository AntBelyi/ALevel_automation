package hw_7.Figures;

public class Main3 {
    public static void main(String[] args) {
        Figure square = new Square(5);
        Figure triangle = new Triangle(3, 4, 5);
        Figure circle = new Circle2(7);

        System.out.println(square);
        System.out.println(triangle);
        System.out.println(circle);
    }
}