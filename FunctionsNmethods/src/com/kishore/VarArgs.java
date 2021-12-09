package com.kishore;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
       fun(2,3,4,67,8908,3564,754,545536,89);
       multiple(45,67,"kishore","syler","manoj","mahalpua");
    }
    static void fun(int ... v) { // variable length arguments
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a , int b , String ...v) { // variable length args always comes at the end only
    }
}
