package com.knu.buga1chuk.others;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DirectoryCheck {
    private static final Logger LOG = LoggerFactory.getLogger(DirectoryCheck.class);

    public static void main(String[] args) {
        String directoryPath = "test";
        String currentDirectory = System.getProperty("user.dir");
        File directory = new File(currentDirectory, directoryPath);

        String fileName = "file.txt";

        File file = new File(directory, fileName);

        if (file.exists()) {
            LOG.warn("File already exist");
        } else {

            try {
                file.createNewFile();

            } catch (IOException e) {
                String messageFormat = "Error: %s;";
                String error = e.getMessage();
                String message = String.format(messageFormat, error);
                LOG.error(message);
            }

            try (FileWriter writer = new FileWriter(file)) {
                writer.write("Hello world!");

            } catch (IOException e) {
                String messageFormat = "Error: %s;";
                String error = e.getMessage();
                String message = String.format(messageFormat, error);
                LOG.error(message);
            }
            LOG.info("File has been created and filled");
        }
    }
}
