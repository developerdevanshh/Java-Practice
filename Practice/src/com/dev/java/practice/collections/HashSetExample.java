package com.dev.java.practice.collections;
import java.util.*;
public class HashSetExample {
    public static void main(String[] args) {

        // Instantiate an Object of HashSet
        HashSet<Integer> hs = new HashSet<>();

        // Adding Elements
        hs.add(1);
        hs.add(4);
        hs.add(9);
        hs.add(4);
        hs.add(9);

        System.out.println("HashSet Size: " + hs.size());
        System.out.println("Elements in HashSet: " + hs);

        // Removing Elements
        hs.remove(1);

        System.out.println("HastSet after removing element : " + hs);

        //
    }
}
