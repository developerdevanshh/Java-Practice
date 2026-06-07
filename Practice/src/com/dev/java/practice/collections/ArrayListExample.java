package com.dev.java.practice.collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
//        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("JavaScript");
        list.add("C++");
        list.add("Java"); // Duplicates Allowed
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Deva");
        list2.add("Deva");
        list2.add("Devansh");
        list2.add("Dev");

        //size
        System.out.println(list.size());

        //removal
        list.remove(0);

        System.out.println(list.size());
        list.add("11");
//        list.clear();

        list.addAll(list2);

        System.out.println(list);


        System.out.println(list.size());

        System.out.println("Fast read(index 1): " + list.get(1)); // O(1)
    }
}
