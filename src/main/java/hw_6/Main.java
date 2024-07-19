package hw_6;

public class Main {
    public static void main(String[] args) {
        MyArray array = new MyArray();

        array.put("1st");
        array.put("2nd");
        array.put("3rd");
        array.put("4rd");
        array.put("5rd");

        System.out.println("Length: " + array.length());

        System.out.println(array.get());
        System.out.println(array.get());
        System.out.println(array.get());
        System.out.println(array.get());
        System.out.println(array.get());

        System.out.println("Length: " + array.length());


        System.out.println(array.get());
        System.out.println(array.get());

        System.out.println("Length before putting element: " + array.length());
        array.put("new Elem");
        System.out.println("Length after putting element: " + array.length());
        System.out.println(array.get());
    }
}