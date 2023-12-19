package com.knu.buga1chuk.others;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileAndPrintIt {
    private static final Logger LOG = LoggerFactory.getLogger(ReadFileAndPrintIt.class);

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
                    LOG.info(string);
                }

            } catch (IOException e) {
                String messageFormat = "Error: %s;";
                String error = e.getMessage();
                String message = String.format(messageFormat, error);
                LOG.error(message);
            }
        } else {
            LOG.info("There is no such file");
        }

    }
}
