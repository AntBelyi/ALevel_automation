package hw_12;

import java.util.Objects;

public class MySet<T> {
    private T[] array;
    private int size;

    @SuppressWarnings("unchecked")
    public MySet(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException("Initial capacity must be greater than zero");
        }
        this.array = (T[]) new Object[initialCapacity];
        this.size = 0;
    }

    public void add(T element) {
        if (size >= array.length) {
            throw new IllegalStateException("Out of bounds exception");
        }
        if (contains(element)) {
            return;
        }
        array[size++] = element;
    }

    private boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(array[i], element)) {
                return true;
            }
        }
        return false;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return array[index];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }
}