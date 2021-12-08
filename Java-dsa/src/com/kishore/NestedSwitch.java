package com.kishore;

import java.util.Scanner;

public class NestedSwitch {
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
                System.out.println("Employee No 3");
                switch (dept) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "MGMT":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No Department entered");
                }
                break;
            default:
                System.out.println("Enter correct employee ID");
        }
    }
}


