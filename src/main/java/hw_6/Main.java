package hw_6;
import hw_6.MyArray;

public class Main {
    public static void main(String[] args) {
        MyArray array = new MyArray();
        //кладемо 5 елементів
        array.put("1st");
        array.put("2nd");
        array.put("3rd");
        array.put("4rd");
        array.put("5rd");

        System.out.println("Довжина: " + array.length());

        System.out.println(array.get()); // Виводимо перший елемент
        System.out.println(array.get()); // Виводимо 2-й елемент
        System.out.println(array.get()); // Виводимо 3-й елемент
        System.out.println(array.get()); // Виводимо 4-й елемент
        System.out.println(array.get()); // Виводимо 5-й елемент

        System.out.println("Довжина: " + array.length());

        // Двічі перевіримо, що немає елементів
        System.out.println(array.get());
        System.out.println(array.get());

        System.out.println("Довжина перед тим як покласти елемент: " + array.length());
        array.put("new Elem");
        System.out.println("Довжина після того, як поклали: " + array.length());
        System.out.println(array.get()); // Виводимо перший елемент
    }
}