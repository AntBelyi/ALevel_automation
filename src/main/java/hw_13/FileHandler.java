package hw_13;

import java.io.*;

public class FileHandler {
    private String fileName;

    public FileHandler(String fileName) {
        this.fileName = fileName;
    }

    public void writeValueToFile(String text) throws IOException {
        try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(fileName), "UTF-8")) {
            writer.write(text);
        }
    }

    public String readValueFromFile() throws IOException {
        StringBuilder result = new StringBuilder();
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream(fileName), "UTF-8")) {
            int charFromFile;
            while ((charFromFile = reader.read()) != -1) {
                result.append((char) charFromFile);
            }
        }
        return result.toString();
    }

    public int fileContainsValue(String text) throws IOException {
        String textFromFile = readValueFromFile();
        int count = 0;
        int i = 0;
        while ((i = textFromFile.indexOf(text, i)) != -1) {
            count++;
            i += text.length();
        }
        return count;
    }

}
