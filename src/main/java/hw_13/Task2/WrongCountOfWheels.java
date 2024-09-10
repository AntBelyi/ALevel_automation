package hw_13.Task2;

public class WrongCountOfWheels extends Exception {
    private final int countOfWheels;

    public WrongCountOfWheels(String message, int countOfWheels) {
        super(message);
        this.countOfWheels = countOfWheels;
    }

    public int getCountOfWheels() {
        return countOfWheels;
    }
}