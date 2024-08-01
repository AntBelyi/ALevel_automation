package hw_13;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Task2 {

    private static String basePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "java" + File.separator + "hw_13";
    public static final String FILE_PATH = basePath + File.separator + "Car.json";

    public static void main(String[] args) {
        Gson gson = new Gson();

        try {
            CarDTO car = gson.fromJson(getValueFromFile(), CarDTO.class);
            System.out.println(car);

            car.setCountOfWheels(6);
            System.out.println(car);

            car.setCountOfWheels(3);
            System.out.println(car);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getValueFromFile() throws IOException {

        try (FileInputStream fileInput = new FileInputStream(FILE_PATH)) {
            byte[] arrayFromJson = fileInput.readAllBytes();
            return new String(arrayFromJson);
        }

    }

}
