package com.kishore;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    // Q.. take input of 2 nos and print the sum

        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = num1 + num2 ;
        System.out.println("The Sum of 2 numbers is: " + sum);

    }
}
