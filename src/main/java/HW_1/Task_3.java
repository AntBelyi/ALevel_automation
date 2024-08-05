package HW_1;

public class Task_3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        System.out.println("До a = " + a);
        System.out.println("До b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Після a = " + a);
        System.out.println("Після b = " + b);
    }
}
