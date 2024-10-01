package Sept.ex_25092024;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter your number :");
        int num=input.nextInt();
        for(int i=1;(i<=10);i++){
            System.out.println(num + " * "+ i + "=" + num*i);

        }
    }
}