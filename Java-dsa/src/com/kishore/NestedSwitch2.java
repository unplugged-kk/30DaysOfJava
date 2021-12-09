package com.kishore;

import java.util.Scanner;

public class NestedSwitch2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String dept = in.next();

        switch (empID) {
            case 1:
                System.out.println("Kishore Kumar");
                break;
            case 2:
                System.out.println("Syler");
                break;
            case 3:
                System.out.println("Emp Number 3");
                switch (dept) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "MGMT":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No dept entered");
                }
                break;
            default:
                System.out.println("Enter correct EmpID");
        }

//        // better way to write
//        switch (empID) {
//            case 1 -> System.out.println("Kishore Kumar");
//            case 2 -> System.out.println("Syler");
//            case 3 -> {
//                System.out.println("Emp Number 3");
//                switch (dept) {
//                    case "IT" -> System.out.println("IT Department");
//                    case "Management" -> System.out.println("Management Department");
//                    default -> System.out.println("No dept entered");
//                }
//            }
//            default -> System.out.println("Enter correct EmpID");
//        }
    }
}