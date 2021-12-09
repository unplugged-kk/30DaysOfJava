package com.kishore;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
    }
    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = num1 + num2 ;
        System.out.println("The Sum of 2 numbers is: " + sum);
    }
    /*
        Access modifier will be looked in Oops
    */
}
