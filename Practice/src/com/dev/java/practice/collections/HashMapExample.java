package com.dev.java.practice.collections;

import java.util.Map;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        // Create a HashMap
        HashMap<String,Integer> hashMap = new HashMap<>();

        // Add elements to the HashMap
        hashMap.put("Dev",23);
        hashMap.put("Naveen",24);
        hashMap.put("Rahul",22);

        // Iterate through the HashMap
        for(Map.Entry<String,Integer> entry :hashMap.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
