package com.kishore;

import javax.management.remote.SubjectDelegationPermission;
import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        // Question is to find largest of 3 nos

//        int max = num1;
//        if (num2 > max) {
//            max = num2;
//        }
//        if (num3 > max) {
//            max = num3;
//        }

        int max = Math.max(num3,(Math.max(num1,num2))); // Math function can be used to shorten the code

        System.out.println("The Maximum no is: " + max );

        }

    }
