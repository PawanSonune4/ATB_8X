package Sept.ex_23092024;

import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);

        System.out.print("Please enter number of month you required :");
        int num= input.nextInt();


        switch (num){
            case (1):
                System.out.println(" Your month is January");
                break;

            case (2):
                System.out.println("Your month is February");
                break;

            case (3):
                System.out.println("Your month is March");
                break;

            case (4):
                System.out.println("Your month is April");
                break;

            case (5):
                System.out.println("Your month is May");
                break;

            case (6):
                System.out.println("Your month is June");
                break;

            case (7):
                System.out.println("Your month is July");
                break;

            case (8):
                System.out.println("Your month is August");
                break;

            case (9):
                System.out.println("Your month is September");
                break;

            case (10):
                System.out.println("Your month is October");
                break;

            case (11):
                System.out.println("Your month is November");
                break;

            case (12):
                System.out.println("Your month is December");
                break;

        }


    }
}
