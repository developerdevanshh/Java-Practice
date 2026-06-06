package com.dev.java.practice.arrayquestions;

import java.util.*;
import java.io.*;

public class FindMaxElem {
//    //Iterative Approach - O(n) Time and O(1) Space
//    static int largest(int[] arr){
//        int max = arr[0];
//
//        // Traverse array elements from second one
//        // compare every element with current max
//        for(int i : arr){
//        // if(arr[i] > max) --> this wrong code 'i' is the actual value not index
//            if(i > max)
//                max = i;
//        }
//        return max;
//    }
//
//    public static void main(String[] args) {
//        try {
////            processFile("data.txt");
//            int[] arr = {10,23,20,15,22,50,58,10,2,22,5};
//            System.out.println(largest(arr));
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("File error");
//        }
//    }

//    //Recursive Approach - O(n) Time and O(n) Space
//    static int findMax(int[] arr, int i){
//
//        // Last index returns the element
//        if(i == arr.length - 1)
//            return arr[i];
//
//        // Find maximum from the rest of the array
//        int recMax = findMax(arr,i+1);
//
//        // Compare with i-th element and return
//        return Math.max(recMax, arr[i]);
//    }
//
//    static int largest(int[] arr){
//        return findMax(arr,0);
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {10,23,20,15,22,50,85,10,2,22,5};
//        System.out.println(largest(arr));
//    }

    // Using Library Methods - O(n) Time and O(1) Space
    public static void main(String[] args) {

    }

}
