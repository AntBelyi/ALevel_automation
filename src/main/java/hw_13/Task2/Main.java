package hw_13.Task2;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();

        try {
            CarDTO car = gson.fromJson(new FileReader("src/resources/Car.json"), CarDTO.class);
            System.out.println("Basic info about the car: " + car);

            car.setCountOfWheels(6);
            System.out.println("After installing wheels: " + car);

            car.setCountOfWheels(3);

        } catch (WrongCountOfWheels e) {
            System.out.println("Exception: " + e.getMessage());
            System.out.println("Wrong amount of wheels: " + e.getCountOfWheels());
        } catch (JsonSyntaxException | IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}