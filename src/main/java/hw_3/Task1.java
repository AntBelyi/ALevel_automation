package hw_3;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
            //Виведіть у консоль один рядок з числами з масиву (які ми створювали в 1-му завданні), розділеними “;”
            double[] arr = {3.43, 12.1212, 12.22, 2.29};
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < arr.length; i++) {
                result.append(arr[i]);
                if (i < arr.length - 1) {
                    result.append(";");
                }
            }

            System.out.println(result.toString());




        }
    }