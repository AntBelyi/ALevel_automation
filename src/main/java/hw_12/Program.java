package hw_12;

public class Program {
    public static void main(String[] args) {

        MySet<Integer> myIntSet = new MySet<>(7);
        myIntSet.add(7);
        myIntSet.add(7);
        myIntSet.add(6);
        myIntSet.add(5);
        myIntSet.add(4);
        myIntSet.add(3);
        myIntSet.add(2);
        myIntSet.add(1);

        System.out.println(myIntSet);

        System.out.println(myIntSet.get(1));
        System.out.println(myIntSet.get(6));
        System.out.println(myIntSet.get(4));
        System.out.println(myIntSet.get(3));

        try {
            myIntSet.add(8);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        MySet<String> myStrSet = new MySet<>(7);

        myStrSet.add("7");
        myStrSet.add("7");
        myStrSet.add("6");
        myStrSet.add("5");
        myStrSet.add("4");
        myStrSet.add("3");
        myStrSet.add("2");
        myStrSet.add("1");

        System.out.println(myIntSet);

        System.out.println(myStrSet.get(1));
        System.out.println(myStrSet.get(6));
        System.out.println(myStrSet.get(4));
        System.out.println(myStrSet.get(3));

        try {
            myStrSet.add("8");
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

    }
}
