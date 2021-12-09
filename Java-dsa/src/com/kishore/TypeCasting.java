package com.kishore;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();

        // Typecasting

        int numm =  (int)68.89f;
        System.out.println(numm);

        // automatic type promotion in expressions
//
//        int a = 267;
//        byte b = (byte)a;
//        System.out.println(b);
//
//        byte c = 50;
//        byte d = 60;
//        byte e = 100;
//        int f = c * d / e ;
//        System.out.println(f);
//
//        int number = 'A';
//        System.out.println(number); // it prints ascii value of A
//
          byte b = 42;
          char c = 'a';
          short s = 1024;
          int i = 50000;
          float f = 5.67f;
          double d = 0.1234;
          double result = (f * b) + ( i / c) - (d * s);
          // float + int - double
          System.out.println((f * b ) + " " + (i / c) + " " + (d * s));
          System.out.println(result);



    }
}
