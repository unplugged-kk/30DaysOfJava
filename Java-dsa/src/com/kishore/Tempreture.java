package com.kishore;

import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class Tempreture {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter temp in celsius : ");
        float tempC = in.nextFloat();
        float tempF = (tempC * 9/5) + 32 ;
        System.out.println(tempF);



    }
}
