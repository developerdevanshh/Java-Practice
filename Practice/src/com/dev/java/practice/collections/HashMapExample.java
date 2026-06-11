package com.dev.java.practice.collections;

import java.util.Map;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        // Create a HashMap (No need to mention the Generic type twice)
        HashMap<String,Integer> hashMap = new HashMap<>();

        // Initialization of a HashMap using Generics
        HashMap<Integer,String> hashMap1 = new HashMap<Integer,String>();

        // Add elements to the HashMap
        hashMap.put("Dev",23);
        hashMap.put("Naveen",24);
        hashMap.put("Rahul",22);

        hashMap1.put(1,"Nikhil");
        hashMap1.put(2,"Aman");
        hashMap1.put(3,"Harsh");

        // Iterate through the HashMap
        for(Map.Entry<String,Integer> entry :hashMap.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("HashMap2" + hashMap1); 
    }
}
