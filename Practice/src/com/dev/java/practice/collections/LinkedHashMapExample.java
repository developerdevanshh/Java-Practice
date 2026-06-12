package com.dev.java.practice.collections;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Using LinkedHashMap of Strings(Keys) and Integer(Values)
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();

        lhm.put(3, "Geeks");
        lhm.put(2, "Geeks");
        lhm.put(1, "Geeks");

        // Printing mappings to the console
        System.out.println("" + lhm);

        // Updating the value with key 2
        lhm.put(2, "For");

        // Printing the updated Map
        System.out.println("Updated Map: " + lhm);
//        System.out.println(lhm);

    }
}
