package com.dev.java.practice.collections;
import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
//        TreeSet<Integer> ts = new TreeSet<>();
//        NavigableSet<String> ts = new TreeSet<>();
//        ts.add("ab");
//        ts.add("bc");
//        ts.add("cd");
//        ts.add("de");
//        ts.add("ef");
//        ts.add("ef");
//        ts.add("ef");
//        ts.add("fg");
//        ts.add("gh");
//        ts.add("hi");
//        ts.add("ij");
//        ts.add("ij");
//
//        System.out.println("Tree Set is: " + ts);

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

//        // Removing the specific existing element inserted above
//        ts.remove("ij");
//
//        System.out.println("After Removing elements: " + ts);
//
//        // Removing the first element using pollFirst() method
//        ts.pollFirst();
//        System.out.println("After Removing First element: " + ts);
//
//        // Removing the last element using pollLast() method
//        ts.pollLast();
//        System.out.println("After Removing Last element: " + ts);

//        Iterator itr = ts.iterator();
//
//        while (itr.hasNext()){
//            System.out.print(itr.next() + " ");
//        }
//
//        System.out.println();
//
//        for(String str : ts){
//            System.out.print(str);
//        }

        // Creating a TreeSet with a Custom Comparator
        Set<StringBuffer> ts = new TreeSet<>(new Comparator<StringBuffer>() {
            @Override
            public int compare(StringBuffer o1, StringBuffer o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });

        // Adding elements to the TreeSet
        ts.add(new StringBuffer("A"));
        ts.add(new StringBuffer("Z"));
        ts.add(new StringBuffer("L"));
        ts.add(new StringBuffer("B"));
        ts.add(new StringBuffer("O"));
        ts.add(new StringBuffer("1"));

        System.out.println(ts);



    }
}
