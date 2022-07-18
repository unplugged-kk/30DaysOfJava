package com.SylerJavaLearn;

import java.util.Scanner;
import java.util.SortedMap;

public class Assignment {
    public static void main(String[] args) {
        // Mini Project
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;

        do {
            System.out.println("Guess My Number: ");
            userNumber = sc.nextInt();

            if(userNumber == myNumber) {
                System.out.println("WHO00 ... YOU FUCKING GUESSED IT RIGHT");
                break;
            }
            else if ( userNumber > myNumber) {
                System.out.println("Your number is too large");
            }
            else {
                System.out.println("Your number is too small");
            }
        } while (userNumber >= 0);

        System.out.println(" My number is :  " + myNumber );
    }
}
