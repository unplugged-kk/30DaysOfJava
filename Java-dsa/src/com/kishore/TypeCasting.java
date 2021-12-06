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

        int a = 267;
        byte b = (byte)a;
        System.out.println(b);


    }
}
