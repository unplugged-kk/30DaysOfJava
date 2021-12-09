package com.kishore;

public class Loops {
    public static void main(String[] args) {
        if(true) {    // if
            System.out.println("If statement is working as condition is true !!");
        }

        int count = 1;
        while(count !=5) {    // while  loop is used when you dont know how many times the loop is going to run
            System.out.println(count);
            count++;
        }

        // FOR LOOP   is used when you know how many times the loop is going to run

        for ( int count1 =1 ; count1 != 5; count1 ++) {
            System.out.println(count1);
        }
    }
}


