package com.kishore;

public class Shadowing {
    static int x = 90; // this will be shadowed at line 8 , higher level got shadowed by a local scope
    public static void main(String[] args) {
        System.out.println(x); // this will print 90
        int x ; // the class variable at line 4 is shadowed by this
//        System.out.println(x); // scope will begin when value is initialized
        x = 40;
        System.out.println(x); // this will print 40
        fun();
    }

    static void fun() {
        System.out.println(x);
    }
}
