package com.dev.java.practice.collections;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.Set;
public class TreeSetExample {
    public static void main(String[] args) {
//        TreeSet<Integer> ts = new TreeSet<>();
        NavigableSet<String> ts = new TreeSet<>();
        ts.add("ab");
        ts.add("bc");
        ts.add("cd");
        ts.add("de");
        ts.add("ef");
        ts.add("ef");
        ts.add("ef");
        ts.add("fg");
        ts.add("gh");
        ts.add("hi");
        ts.add("ij");
        ts.add("ij");

        System.out.println("Tree Set is: " + ts);

//        String check = "de";
//
//        System.out.println("Contains: " + check + " " + ts.contains(check));
//
//        // Print the first element in the TreeSet
//        System.out.println("First Value: " + ts.first());
//
//        // Print the last element in the TreeSet
//        System.out.println("Last Value: " + ts.last());
//
//        String val = "ef";
//
//        // Find the values greater than and smaller than the above String
//        System.out.println("Higher " + ts.higher(val));
//        System.out.println("Lower " + ts.lower(val));

        // Removing the specific existing element inserted above
        ts.remove("ij");

        System.out.println("After Removing elements: " + ts);



    }
}
