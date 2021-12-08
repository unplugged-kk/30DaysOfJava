package com.kishore;

import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Taking input from the user till the user does not press X or x
        // take operator as input

        int ans = 0;
        while (true) {
            System.out.println("Enter the operator: ");
            char op = in.next().trim().charAt(0);
            if ( op == '+' || op == '-' || op == '*' || op == '/' || op =='%') {
            // input 2 nos
                System.out.println("Enter 2 numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if(op == '+') {
                   ans = num1 + num2;
                }
                if(op == '-') {
                    ans = num1 - num2;
                }
                if(op == '*') {
                    ans = num1 * num2;
                }
                if(op == '/') {
                    if(num2 !=0){
                        ans = num1 / num2;
                    }
                }
                if(op == '%') {
                    ans = num1 % num2;
                }

            } else if ( op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid Operation");
            }
            System.out.println(ans);
        }
    }
}
