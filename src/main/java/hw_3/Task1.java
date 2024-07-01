package hw_3;

public class Task1 {
    public static void main(String[] args) {
            double[] arr = {3.43, 12.1212, 12.22, 2.29};
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < arr.length; i++) {
                result.append(arr[i]);
                if (i < arr.length - 1) {
                    result.append(";");
                }
            }

            System.out.println(result);

        }
    }