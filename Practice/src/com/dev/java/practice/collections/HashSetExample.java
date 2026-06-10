package com.dev.java.practice.collections;
import java.io.FilterOutputStream;
import java.util.*;
public class HashSetExample {
    public static void main(String[] args) {

//        // Instantiate an Object of HashSet
//        HashSet<Integer> hs = new HashSet<>();
//
//        // Adding Elements
//        hs.add(1);
//        hs.add(4);
//        hs.add(9);
//        hs.add(4);
//        hs.add(9);
//
//        System.out.println("HashSet Size: " + hs.size());
//        System.out.println("Elements in HashSet: " + hs);
//
//        // Removing Elements
//        hs.remove(1);
//
//        System.out.println("HastSet after removing element : " + hs);
//
//        // Return false if the element is not present
//        System.out.println("Remove 1 : " + hs.remove(1));

        HashSet<String> hs = new HashSet<>();

        hs.add("ab");
        hs.add("bc");
        hs.add("cd");
        hs.add("de");
        hs.add("ef");
        hs.add("fg");
        hs.add("gh");
        hs.add("hi");
        hs.add("ij");

        System.out.println("Using Iterator : ");
        Iterator<String> iterator = hs.iterator();

        while(iterator.hasNext()){
            System.out.print(iterator.next() + ", ");
        }

        System.out.println();

        System.out.println("Using enhanced for loop:");
        for(String elem : hs){
            System.out.print(elem + ", ");
        }
    }
}
