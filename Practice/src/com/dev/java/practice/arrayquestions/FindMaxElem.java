package com.dev.java.practice.arrayquestions;

public class FindMaxElem {
    static int largest(int[] arr){
        int max = arr[0];

        // Traverse array elements from second one
        // compare every element with current max
        for(int i : arr){
//            if(arr[i] > max)
            if(i > max)
                max = i;
        }
        return max;
    }

    public static void main(String[] args) {
        try {
//            processFile("data.txt");
            int[] arr = {10,23,20,15,22,50,58,10,2,22,5};
            System.out.println(largest(arr));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("File error");
        }
    }
}
