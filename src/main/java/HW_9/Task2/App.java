package HW_9.Task2;

public class App {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                .setModel("BMW")
                .setPrice(60000)
                .setMaxSpeed(200)
                .setCountOfWheels(4)
                .build();
        System.out.println(car);
        Car car1 = new Car.Builder()
                .setModel("Lexus")
                .setPrice(25000)
                .setMaxSpeed(200)
                .setCountOfWheels(4)
                .build();
        System.out.println(car1);
    }
}