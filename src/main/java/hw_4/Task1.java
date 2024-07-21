package hw_4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coefficient a, but a must not be equal to 0:");
        double a = scanner.nextDouble();
        if (a == 0) {
            System.out.println("The coefficient a should not be equal to 0!");
            return;
        }


        System.out.println("Enter the coefficient b:");
        double b = scanner.nextDouble();

        System.out.println("Enter the coefficient c:");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Root equations: x1 = " + root1 + ", x2 = " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("The equation has one root: x = " + root);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}
