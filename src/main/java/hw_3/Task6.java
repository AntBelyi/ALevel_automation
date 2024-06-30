package hw_3;

public class Task6 {
        public static void main(String[] args) {
            int i = 124;
            byte b = 66;
            double d = 77.098;

            Number[] array = new Number[3];
            array[0] = i;
            array[1] = b;
            array[2] = d;

            for (Number value : array) {

                System.out.println(value);
            }
        }
    }