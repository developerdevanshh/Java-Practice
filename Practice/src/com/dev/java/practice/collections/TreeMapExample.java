package com.dev.java.practice.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    static void TreeMapConstructor(){
        // Create a TreeMap of Strings (keys) and Integer (values)
        TreeMap<String, Integer> tm = new TreeMap<>();

        // Mapping String values to int keys using put() method
        tm.put("Dev",11);
        tm.put("Ravi",12);
        tm.put("Neelam",15);


        System.out.println(tm);
    }

    public static void main(String[] args) {
        System.out.println("TreeMap using TreeMapConstructor");

        TreeMapConstructor();
    }
}
