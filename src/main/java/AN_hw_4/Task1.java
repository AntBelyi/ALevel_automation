package AN_hw_4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the coefficients a, b, and c");
        System.out.println("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();
        double discriminator = b * b - 4 * a * c;
        if (discriminator > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(discriminator)) / (2 * a);
            x2 = (-b + Math.sqrt(discriminator)) / (2 * a);
            System.out.println("The roots of the equation are: x1 = " + x1 + ", x2 = " + x2);
        } else if (discriminator == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("The equation has a single root: x = " + x);
        } else {
            System.out.println("The equation has no real roots!");
        }
    }
}