package hw_9.task2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                .setModel("BMW")
                .setPrice(50000)
                .setSpeed(350)
                .setCountOfWheels(4)
                .build();

        System.out.println(car);

    }
}
