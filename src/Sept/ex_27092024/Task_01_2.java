package Sept.ex_27092024;

import java.util.Scanner;

public class Task_01_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;  // Declare age variable

        do {
            System.out.print("Please enter your age: ");
            age = input.nextInt();  // Get user input

            if (age < 18) {
                System.out.println("You are not eligible for VOTE!");
            } else {
                System.out.println("You are eligible for VOTE!");
            }

        } while (age < 18);  // Continue if age is less than 18

        input.close();  // Close the scanner
    }
}

