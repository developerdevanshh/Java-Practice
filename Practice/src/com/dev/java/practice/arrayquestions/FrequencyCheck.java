//package com.dev.java.practice.arrayquestions;
//
//import java.util.*;
//public class FrequencyCheck {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // Step 1: Read the Comma-separated line of numbers
//        if (!sc.hasNextLine()) returns;
//        String firstLine = sc.nextLine().trim();
//
//        // Split the string by commas and covert to an integer array
//        String[] tokens = firstLine.split(",");
//        int[] arr = new int[tokens.length];
//        for (int i = 0;i < tokens.length; i++){
//            arr[i] = Integer.parseInt(tokens[i].trim());
//        }
//
//        // Read the integer K
//        int k = sc.nextInt();
//
//        //
//    }
//}

package com.dev.java.practice.arrayquestions;

import java.util.*;

public class FrequencyCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Read the comma-separated line of numbers
        if (!sc.hasNextLine()) return;
        String firstLine = sc.nextLine().trim();

        // Split the string by commas and convert to an integer array
        String[] tokens = firstLine.split(",");
        int[] arr = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            arr[i] = Integer.parseInt(tokens[i].trim());
        }

        // Step 2: Read the integer K
        int k = sc.nextInt();

        // Step 3: Count frequencies using LinkedHashMap to preserve first-appearance order
        Map<Integer, Integer> frequencyMap = new LinkedHashMap<>();
        for (int score : arr) {
            frequencyMap.put(score, frequencyMap.getOrDefault(score, 0) + 1);
        }

        // Step 4: Move the unique scores into a list to sort them
        List<Integer> uniqueScores = new ArrayList<>(frequencyMap.keySet());

        // Step 5: Sort based on frequency (descending)
        // Since LinkedHashMap preserved original order, a tie here keeps the original order.
//        Collections.sort(uniqueScores, new Comparator<Integer>() {
//            @Override
//            public void compare(Integer a, Integer b) {
//                int freqA = frequencyMap.get(a);
//                int freqB = frequencyMap.get(b);
//
//                // Sort by frequency in descending order
//                if (freqB != freqA) {
//                    return Integer.compare(freqB, freqA);
//                }
//
//                // If frequencies match, keep original order.
//                // In Java's Collections.sort (TimSort), returning 0 preserves stable order.
//                return 0;
//            }
//        });
        // 1. Uses the diamond operator `<>`
//        List<Integer> uniqueScores = new ArrayList<>(frequencyMap.keySet());

// 2. Uses List.sort() instead of Collections.sort()
// 3. Uses a clean Lambda (a, b) -> ... instead of an anonymous class
// 4. Correctly returns an 'int' instead of 'void'
        uniqueScores.sort((a, b) -> {
            int freqA = frequencyMap.get(a);
            int freqB = frequencyMap.get(b);

            if (freqB != freqA) {
                return Integer.compare(freqB, freqA); // Higher frequency comes first
            }
            return 0; // Keeps original insertion order stable
        });

        // Step 6: Print the top K scores
        // Ensure we don't go out of bounds if K is larger than unique items
        int limit = Math.min(k, uniqueScores.size());
        for (int i = 0; i < limit; i++) {
            System.out.print(uniqueScores.get(i));
            if (i < limit - 1) {
                System.out.print(" ");
            }
        }
        System.out.println(); // Newline at the end

        sc.close();
    }
}