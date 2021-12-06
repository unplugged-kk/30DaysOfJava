package com.SylerJavaLearn;

import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void printJava() {
        System.out.println("Hello Java");
    }

    public static void main(String[] args) {
	// Variables
        System.out.println("Hello Java !!");
        String name = "Kishore";
        int age = 28;
        String altname = "Syler";


        // byte - 1 [ -128 to 127 ]
        // short - 2
        // int - 4 1,2,3
        // long - 8
        // float - 4 3.14
        // double - 8
        // char - 2 a,b,c,d
        // boolean - 1 true/false

        // Examples Primitive Types

        byte age2 = 30 ;
        int phone = 1234567890;
        long phone2 = 12345678900L; //LONG TYPE NO
        float pi = 3.14F; //STORAGING FLOAT
        char letter = '@';
        boolean isAdult = false;


        // Example Non Primitive Types

        String name2 = "Chucha"; // in string we can store more chars till the system memory allows
        System.out.println(name2.length());  //  here length is a method/function for name
        System.out.println(name2.charAt(2));
        String name3 = name2.replace('a', 'i');
        System.out.println(name3);

        // Strings & Substrings

        String name4 = " Kishore & Mahal ";
        System.out.println(name4.substring(0,4));

        // Arrays  arrays are non primitive data types

        int [] marks = new int[3];
        marks[0] = 98;
        marks[1] = 53;
        marks[2] = 28;

        System.out.println(marks[0]);  // array values does not get printed by simply using  System.out.println(marks)

        // sort
        System.out.println(marks[2]);
        Arrays.sort(marks);
        System.out.println(marks[2]);
        int [] marks2 = {89,90,67}; // if we know what elements needs to be added in the array then new keyword not required
        int [][] finalmarks = {{86,56,34},{23,45,96}}; // 2D arrays
        System.out.println(finalmarks[1][2]); // 2D array data access

        // casting

        double price = 100.00; // implicit casting we just stored int  value to a double
        double finalPrice = price + 18;
        System.out.println(finalPrice);

        int p = 100;
        int fP = p + (int) 18.10; // explicit casting we are converting float to int
        System.out.println(fP);

        // constants

        int age3 = 30;
        age3 = 31; // value of variable can be changed as many times anyone can change
        age3 = 32;

        final float PI = 3.14f; // once final keyword used the value of the variable can't be changed.

        // operators

        int a = 1;
        int b = 2;
        int sum = a - b; // + , - , * , / , % (modulo operator only for getting reminder), operators can be used for different operations.
        System.out.println(sum);

        // unary operators , it doesn't require 2 operands

        int numb = 1;
        numb++ ; //without unary operator it will be written as numb = numb + 1
        System.out.println(numb);
        ++numb;
        System.out.println(numb);
        --numb;
        System.out.println(numb);

        // Math class
        System.out.println(Math.min(4,5));
        System.out.println(Math.random()); // random returns one random value form 0.0 - 1.0
        System.out.println((int)Math.random());
        System.out.println((int)(Math.random()*100));

        // Taking user inputs scanner

        Scanner sc = new Scanner(System.in);
        System.out.println("Input your age: ");
        int age5 = sc.nextInt();
        System.out.println(age5);

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Input your name: ");
        String name8 = sc1.next(); // next only accepts single word ,not the full string to take input the full line use nextLine instead of next
        System.out.println(name8);

        // Comparison Operators
        // a == b , a != b , a < b , a > b , a >= b , a <= b
        // Conditional Statements

        boolean isSunUp = false;
        if (isSunUp == true)
            System.out.println("Day");
        else
            System.out.println("Night");

        // logical operators && which checks both if conditions are true or not

        int d = 60;
        int e = 40;
        if( d > 50 && e < 50)
            System.out.println("both condition satisfied");
        else
            System.out.println("no condition satisfied");

        // || or condition

        if ( d < 50 || e < 50)
            System.out.println("Or condition worked");

        Scanner sc3 = new Scanner(System.in);
        // pen = 10 ; notebook = 40

        int cash = sc3.nextInt();
        if(cash < 10) {      // { used for block in java , if we want to write more lines
            System.out.println("Cant buy anything");
            System.out.println("Bring more cash");
        }
        // conditional statement - SWITCH

        int dayy = 1; // 1- monday , 2- tuesday , in switch statement if one condition gets true it doesn't check other condition simply prints all the other condition o/ps
        // to tackle this kind of situation break statement is used . without break it will print all. break not added in default block

        switch(dayy) {
            case 1 :
                System.out.println("monday");
                break;
            case 2 :
                System.out.println("tuesday");
                break;
            case 3 :
                System.out.println("wednesday");
                break;
            default :
                System.out.println("thu-sunday");
        }

        // Loops
        // for loop
        // 1- 10

        for(int j = 1; j <=10; j++) {
            System.out.println(j);
        }

        // 10 -1
        for(int i = 10;i>=1;i--) {
            System.out.println(i);
        }

        // While loop which  checks the condition is true

        int k = 30;
        while(k >=1) {
            System.out.println(k);
            k--;
        }

        // Do while loop

        int l = 20;
        do {
            System.out.println(l);
            l--;
        } while (l>=1);
        }

        // Function call








    }








