package com.dev.java.practice.collections;
import java.util.ArrayList;
import java.util.List;
public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("JavaScript");
        list.add("C++");
//        list.add("Java"); // Duplicates Allowed

        System.out.println(list);

//        System.out.println("Fast read(index 1): " + list.get(1)); // O(1)
    }s
}
