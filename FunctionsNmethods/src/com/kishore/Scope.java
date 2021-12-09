package com.kishore;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        {
//            int a = 90; // already initialized outside the block in the same method, hence you can't initialize again , but you can change the value
            a = 100; // it can reassign the original reference variable to some other value
            System.out.println(a);
            int c = 99;

            // values initialized in the block will remain in the block

        }
//        System.out.println(c);  // can not use outside the block
        System.out.println(a);
    }

    static void random(int marks) {
        int num = 56;
        System.out.println(num);
        System.out.println(marks);
    }
}
