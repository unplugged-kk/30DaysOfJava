package com.kishore;

import java.util.Scanner;

public class SumReturnArg {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println(ans);

        // here parameters are used with function call and return
        int answer = sum2(89,11);
        System.out.println(answer);
    }

    // Use return , it helps to store o/p of a function to store in a return type as int or string

    static int sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st Num");
        int num1 = in.nextInt();
        System.out.println("Enter 2nd Num");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;

    }
    // pass the value of the numbers when you are calling the method in main ()

    static int sum2(int a , int b) {
        int sum = a + b ;
        return sum;
    }
}
