package hw_3;

public class Task6 {
    public static void main(String[] args) {
        byte b = 25;
        int i = 250;
        long l = 2500L;

        int[] intArray = new int[3];
        intArray[0] = b;
        intArray[1] = i;
        intArray[2] = (int) l;

        for (int value : intArray) {
            System.out.println(value);
        }
    }
}