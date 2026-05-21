package com.dev.java.practice;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()){
            String s = sc.next();
            StringBuffer result = new StringBuffer();
            for(int i = s.length() -1;i>=0;i--){
                result.append(s.charAt(i));
            }
            System.out.println(result);
        }
    }
}
