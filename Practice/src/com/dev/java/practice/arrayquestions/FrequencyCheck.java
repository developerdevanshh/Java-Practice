package com.dev.java.practice.arrayquestions;

import java.util.*;
public class FrequencyCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Read the Comma-separated line of numbers
        if (!sc.hasNextLine()) return;
        String firstLine = sc.nextLine().trim();

        // Split the string by commas and covert to an integer array
        String[] tokens = firstLine.split(",");
        int[] arr = new int[tokens.length];
        for (int i = 0;i < tokens.length; i++){
            arr[i] = Integer.parseInt(tokens[i].trim());
        }

        // Read the integer K
        int k = sc.nextInt();

        // Count frequencies using LinkedHashMap to preserve first-appearance order
        Map<Integer,Integer> frequencyMap = new LinkedHashMap<>();
        for(int score : arr){
            frequencyMap.put(score,frequencyMap.getOrDefault(score,0) + 1);
        }

        // Move the unique scores into a list to sort them
        List<Integer> uniqueScores = new ArrayList<>(frequencyMap.keySet());

        // Sort Based on frequency (Descending)
        // Since LinkedHashMap preserved original order, a tie here keeps the origin order.
        Collections.sort(uniqueScores, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                int freqA = frequencyMap.get(a);
                int freqB = frequencyMap.get(b);

                // Sort by frequency in Descending Order
                if(freqA != freqB){
                    return Integer.compare(freqA,freqB);
                }

                // if frequencies match, keep original order.
                // In Java's Collection.sort (TimSort), returning 0 preserves stable order.
                return 0;
            }
        });

        // Print the top K scores
        // Ensure we don't go out of bounds if K is larger than unique items
        int limit = Math.min(k,uniqueScores.size());
        for(int i = 0;i < limit ;i++){
            System.out.println(uniqueScores.get(i));
            if(i < limit - 1){
                System.out.println(" ");
            }
        }
        System.out.println();

        sc.close();
    }
}
