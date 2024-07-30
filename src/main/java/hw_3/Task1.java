package hw_3;

public class Task1 {
    public static void main(String[] args) {
        // HW Strings
        //Print in the console a single line with the numbers from the array (which we created in the 1st task), separated by ';'
        int[] array = {1, 2, 3, 4, 5};
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);
            if (i < array.length - 1) {
                result.append(";");
            }
        }
        System.out.println(result);
        // Create a variable with the string "Mother washed the frame"
        // Create an array of all the words found in this string.
        String message = "Mother washed the frame";
        String[] words = message.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
        /*Create a string 'I want line breaks'
        Replace all space characters in the string with newline characters and print it to the console.*/
        String str = "I want line breaks";
        String replacedstr = str.replace(" ", "\n");
        System.out.println(replacedstr);
    }
}