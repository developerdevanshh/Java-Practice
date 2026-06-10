package com.dev.java.practice.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        HashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("ab");
        lhs.add("bc");
        lhs.add("cd");
        lhs.add("de");
        lhs.add("ef");
        lhs.add("fg");
        lhs.add("gh");
        lhs.add("hi");
        lhs.add("ij");

        System.out.println("Using Iterator : ");
        Iterator<String> iterator = lhs.iterator();

        while(iterator.hasNext()){
            System.out.print(iterator.next() + ", ");
        }

        System.out.println();

        System.out.println("Using enhanced for loop:");
        for(String elem : lhs){
            System.out.print(elem + ", ");
        }
    }
}
