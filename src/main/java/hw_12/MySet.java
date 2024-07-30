package hw_12;

import java.util.Arrays;

public class MySet<T> {

    private T[] array;
    private int size;

    public MySet(int capacity) {
        array = (T[]) new Object[capacity];
        size = 0;
    }

    public void add(T item) {

        if (size == array.length) {
            throw new IllegalStateException("Out of bounds exception");
        }

        for (int i = 0; i < size; i++) {
            if (array[i].equals(item)) {
                return;
            }
        }

        array[size++] = item;

    }

    public T get(int index) {
        if ((index < 0) || (index >= size)) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        return array[index];
    }

    @Override
    public String toString() {

        if (size == 0) {
            return "[]";
        }

        String result = "[";

        for (int i = 0; i < size; i++) {
            result += array[i];
            if (i < size - 1) {
                result += ",";
            }
        }

        result += "]";

        return result;
    }
}
