package hw_11.Task3;

public class Main {
    public static void main(String[] args) {
        QueueOperations operations = new QueueOperations();

        operations.addElements();
        operations.displayQueue();

        operations.removeElement();
        operations.displayQueue();

        operations.viewHead();

        operations.checkIfEmpty();

        operations.checkSize();
    }
}