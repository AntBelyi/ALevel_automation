package hw_6;

public class MyArray {
    private String[] array;
    private int size;

    public MyArray() {
        array = new String[10];
        size = 0;
    }

    public int length() {
        return size;
    }

    public void put(String str) {
        if (size == array.length) {
            String[] newArray = new String[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size++] = str;
    }

    public String get() {
        if (size == 0) {
            return "No more elements";
        }
        String firstElement = array[0];
        System.arraycopy(array, 1, array, 0, size - 1);
        array[--size] = null;
        return firstElement;
    }
}