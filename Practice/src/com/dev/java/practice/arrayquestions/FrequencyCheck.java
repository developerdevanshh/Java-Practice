package com.dev.java.practice.arrayquestions;

import java.util.*;
public class FrequencyCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Read the Comma-separated line of numbers
        if (!sc.hasNextLine()) returns;
        String firstLine = sc.nextLine().trim();

        // Split the string by commas and covert to an integer array
        String[] tokens = firstLine.split(",");
        int[] arr = new int[tokens.length];
        for (int i = 0;i < tokens.length; i++){
            arr[i] = Integer.parseInt(tokens[i].trim());
        }

        // Read the integer K
        int k = sc.nextInt();

        //  
    }
}
