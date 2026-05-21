package com.dev.java.practice;

import  java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sec = -1, largest = -1;
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            if(largest < x ){
                sec = largest;
                largest = x;
            }else if(x > sec && x!= largest){
                sec = x;
            }

        }
        System.out.println(sec);
    }
}
