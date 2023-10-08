package main.java.others;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        System.out.println("What you want to do?");
        System.out.println("1. Convert Celsius to Fahrenheit.");
        System.out.println("2. Convert Fahrenheit to Celsius.");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        System.out.println("Enter a degrees");
        int degrees = scanner.nextInt();

        if (choice == 1) {
            int fahrenheitValue = (degrees * 9 / 5) + 32;

            String result = "celsius to fahrenheit = ";
            String messageFormat = "%d %s %d;";
            String message = String.format(messageFormat, degrees, result, fahrenheitValue);
            System.out.println(message);

        } else {
            int celsiusValue = (degrees - 32) * 5 / 9;

            String result = "fahrenheit to celsius = ";
            String messageFormat = "%d %s %d;";
            String message = String.format(messageFormat, degrees, result, celsiusValue);
            System.out.println(message);
        }

    }

}
