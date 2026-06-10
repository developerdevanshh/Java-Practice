package com.dev.java.practice.collections;
import java.util.TreeSet;
import java.util.Set;
public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(10);
        ts.add(30);
        ts.add(20);
        ts.add(30);

        System.out.println(ts);
    }
}
