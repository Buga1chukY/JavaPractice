package main.java;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DirectoryCheck {
    public static void main(String[] args) {
        String directoryPath = "test";
        String currentDirectory = System.getProperty("user.dir");
        File directory = new File(currentDirectory, directoryPath);

        String fileName = "file.txt";

        File file = new File(directory, fileName);

        if (file.exists()) {
            System.out.println("File already exist");
        } else {

            try {
                file.createNewFile();

            } catch (IOException e) {
                String messageFormat = "Error: %s;";
                String error = e.getMessage();
                String message = String.format(messageFormat, error);
                System.out.println(message);
            }

            try (FileWriter writer = new FileWriter(file)) {
                writer.write("Hello world!");

            } catch (IOException e) {
                String messageFormat = "Error: %s;";
                String error = e.getMessage();
                String message = String.format(messageFormat, error);
                System.out.println(message);
            }

            System.out.println("File has been created and filled");

        }
    }
}
