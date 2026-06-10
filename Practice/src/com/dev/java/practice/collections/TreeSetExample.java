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
    }
}
