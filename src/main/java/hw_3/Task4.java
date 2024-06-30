package hw_3;
import java.util.Arrays;
public class Task4 {
    public static void main(String[] args) {
       //Створіть масив із цілих чисел і помістіть відразу 10 значень. Пройдіться ними і змініть значення.
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;  // Наприклад, множимо кожне значення на 2
        }
        System.out.println(Arrays.toString(arr));
    }
}