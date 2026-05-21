package com.dev.java.practice;
import java.util.*;
public class MoveZerosAtEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int idx = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i] != 0){
                int temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;
                idx++;
            }
        }
        for(int num : arr) System.out.println(num + " ");
    }
}
