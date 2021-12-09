package com.kishore;

public class FunctionOverloading {
    public static void main(String[] args) {
        fun(56);
        fun("syler");
        int ans = sum(5,6);
        System.out.println(ans);
        int anss = sum(99,1,10);
        System.out.println(anss);
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println(name);
    }

    // function overloading can occur when more functions of same name is there in program either the no of args with different or types of arg is different.

    static int sum(int a, int b) {
        return a + b ;
    }

    static int sum(int a, int b, int c) {
        return a + b + c ;
    }
}
