package Sept.ex_23092024;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter your first number : ");
        int num1=input.nextInt();

        System.out.print("Please enter your second number : ");
        int num2= input.nextInt();

        System.out.println(" Please choose your operation :");
        System.out.println("1 for Addition ( + )");
        System.out.println("2 for Subtract ( - )");
        System.out.println("3 for Multiply ( * )");
        System.out.println("4 for Division ( / )");
        System.out.println("5 for Modulus ( % )");

        int choice = input.nextInt();
        double result;

          switch (choice){
              case (1):
              result=num1+num2;
                  System.out.println("Your addition is :"+result);
                  break;

              case (2):
                  result=num1-num2;
                  System.out.println("Your Subtraction is :"+result);
                  break;

              case (3):
                  result= num1*num2;
                  System.out.println("Your multiplication is :"+result);
                  break;

              case (4):
                  if(num2 !=0) {
                      result = num1/num2;
                      System.out.println("Your division is :" +result);
                  }else {
                      System.out.println("Error! Division by zero ");
                  }
                  break;

              case (5):
                  if (num2!=0) {
                      result = num1 % num2;
                      System.out.println("Your remainder is :"+result);
                  }else {
                      System.out.println("Error! Modulus by zero");
                  }
                  break;

              default:
                  System.out.println("Invalid operation choice");
                  break;
          }

    }
}
