package com.kishore;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
	// write your code here
    // Q. store 5 roll numbers
    int rno1 = 23;
    int rno2 = 56;
    int rno3 = 78;

    // syntax
    // datatype[]  variable_name = new datatype[size];
    // store 5 roll numbers:

//    int[] rnos = new int[5];
//
//    // or directly
//
//    int[] rnos2 = {23,12,45,32,15};

      int arr []; // declaration of array. ros is getting defined in the stack
      arr = new int[5]; // initialization : actually here the object is being created in the heap
      arr[0] = 13;
      arr[1] = 23;
      arr[2] = 33;
      arr[3] = 43;
      arr[4] = 53;
      // [23, 45, 233, 543, 3]
        System.out.println(arr[3]);

      // input using for loops

      for (int i = 0; i < arr.length;i++)  {
          arr[i] = in.nextInt();
      }

      for (int i = 0; i < arr.length;i++) {
          System.out.print(arr[i] + " ");
      }

      for(int num : arr) { // for every element in array , print the element
          System.out.println(num + " "); // here num represents element fo the array
      }

//        System.out.println(arr[5]); // index out of bound error
    }
}
