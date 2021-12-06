package com.kishore;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter some input: ");
        int rollno = input.nextInt();
        System.out.println("The Roll no is " + rollno);
    }
}

