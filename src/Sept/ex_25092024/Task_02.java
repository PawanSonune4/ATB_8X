package Sept.ex_25092024;

import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
     Scanner input= new Scanner(System.in);
        System.out.println("Welcome to factorial calculator");
        System.out.print("Please enter your number :");
        int num=input.nextInt();
        long fact =Factorial(num);
        System.out.println("Your factorial is :"+ fact);
     }
     public static long Factorial(int num) {
         if (num < 2) {
             return 1;
         }
         long fact =1;
         int i=2;
         while (i<=num){
             fact *=i;
             i++;
         }
            return fact;
     }
}