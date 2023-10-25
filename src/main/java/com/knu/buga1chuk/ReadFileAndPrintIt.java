package com.knu.buga1chuk;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileAndPrintIt {
    public static void main(String[] args) {

        String directoryPath = "test";
        String currentDirectory = System.getProperty("user.dir");

        File directory = new File(currentDirectory, directoryPath);

        String fileName = "file.txt";

        File file = new File(directory, fileName);

        if (file.exists()) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                String string;
                while ((string = bufferedReader.readLine()) != null) {
                    System.out.println(string);
                }

            } catch (IOException e) {
                String messageFormat = "Error: %s;";
                String error = e.getMessage();
                String message = String.format(messageFormat, error);
                System.out.println(message);
            }
        } else {
            System.out.println("There is no such file");
        }

    }
}
