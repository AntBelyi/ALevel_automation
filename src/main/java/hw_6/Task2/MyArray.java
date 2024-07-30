package hw_6.Task2;

import java.sql.SQLOutput;

public class MyArray {

    public String[] array = new String[3];


    public int length() {
        int result = 0;
        for (String value : array) {
            if (value != null) {
                result++;
            }
        }
        return result;
    }

    public void put(String value) {
        if (length() != array.length) {
            putElementToArray(value);

        } else {
            increaseArray();
            putElementToArray(value);
        }
    }

    public String get() {
        String elementToReturn = "";
        if(length() == 0) {
            elementToReturn = "No more elements.";
        } else {
            elementToReturn = array[0];
            updateArray();

        }
        return elementToReturn;
    }

    private void increaseArray() {
        String[] newArray = new String[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;

    }

    private void putElementToArray(String value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                continue;
            }
            array[i] = value;
            break;
        }
    }

    private void updateArray() {
        array[0] = null;
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

    }
}
