package hw_13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {
    private String fileName;

    public FileHandler(String fileName) {
        this.fileName = fileName + ".txt";
    }

    public void writeValueToFile(String text) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(text);
        } catch (IOException e) {
            System.out.println("You have a mistake: " + e.getMessage());
        }
    }

    public String readValueFromFile() {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println("You have a mistake: " + e.getMessage());
        }
        return content.toString();
    }

    public int fileContainsValue(String value) {
        String content = readValueFromFile();
        int count = 0;
        int index = 0;
        while ((index = content.indexOf(value, index)) != -1) {
            count++;
            index += value.length();
        }
        return count;
    }
}