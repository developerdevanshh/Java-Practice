package com.dev.java.practice.arrayquestions;
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

    //Recursive Approach - O(n) Time and O(n) Space
    static int findMax(int[] arr, int i){

        return 0;
    }

    static int largest(int[] arr){
        return findMax(arr,0);
    }

    public static void main(String[] args) {
        int[] arr = {10,23,20,15,22,50,58,10,2,22,5};
        System.out.println(largest(arr));
    }
}
