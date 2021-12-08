package com.kishore;

public class ConditionsNLoops {

    public static void main(String[] args) {
        /*
        Syntax of If Statement:
        if (boolean expression T or F) {
        // BODY
        }
        else {
        // do this
        }
         */

        int salary = 5000;
        if (salary >= 10000) {
            salary = salary + 5000;
        } else {
            salary = salary + 2000;
        }

        System.out.println(salary);

        for ( int count3 =1 ; count3 != 5; count3 ++) {
            System.out.println(count3);
        }
        /*
        // While loops
         while(condition) {
         // body
         }
         */

        int count4 = 1;
        while(count4 <= 5) {
            System.out.println(count4);
            count4++;
        }

        /*
        // do while loop   only used where at least once the loop runs.

        do {
        }
        while(condition);
         */

        int count5 = 1;
        do {
            System.out.println("Do While executed");
            count5++;
        } while (count5 !=1);
    }
}

