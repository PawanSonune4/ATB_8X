package Sept.ex_23092024;

import java.util.Scanner;

public class Task_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a conversion type:");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Celsius to Fahrenheit");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the distance in kilometers: ");
                double kilometers = scanner.nextDouble();
                double miles = kilometersToMiles(kilometers);
                System.out.printf(kilometers+ " KM is equal to "+ miles + " miles");
                break;

            case 2:
                System.out.print("Enter the temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = celsiusToFahrenheit(celsius);
                System.out.printf(celsius+"°C is equal to "+ fahrenheit +"°F");
                break;

            default:
                System.out.println("Invalid choice! Please select 1 or 2.");
        }


    }

    // Method to convert kilometers to miles
    public static double kilometersToMiles(double kilometers) {
       double Km= kilometers*0.621371;
        return Km;
    }

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        double Cel=  (celsius * 9/5) + 32;
        return Cel;
    }
}
