package com.dev.java.practice;
import java.util.*;
public class CheckAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next().toLowerCase(), s2 = sc.next().toLowerCase();
        if(s1.length() != s2.length()){
            System.out.println("No");
            return;
        }
        int[] count = new int[26];
        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)-'a']++;
            count[s2.charAt(i)-'a']--;
        }
        for(int c : count){
            if(c != 0){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
