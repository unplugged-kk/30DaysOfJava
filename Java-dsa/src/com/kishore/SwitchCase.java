package com.kishore;

import java.util.concurrent.ScheduledExecutorService;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

//        switch (fruit) {
//            case "Mango":
//                System.out.println("King of Fruits");
//                break;
//            case "Apple":
//                System.out.println("A sweet red fruit");
//                break;
//            case "Orange":
//                System.out.println("Round Fruit");
//                break;
//            default:
//                System.out.println("Please enter the correct fruit");
//        }

        switch (fruit) {         // New switch syntax much cleaner
            case "Mango" -> System.out.println("King of Fruits");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Orange" -> System.out.println("Round Fruit");
            default -> System.out.println("Please enter the correct fruit");
        }

    }
}
