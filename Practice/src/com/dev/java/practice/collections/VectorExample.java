package com.dev.java.practice.collections;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
//        Vector<String> v = new Vector<>();
//        v.add("A");
//        v.add("B");
//        v.add("C");
//        System.out.println(v);

        Vector<Integer> vector = new Vector<>(2); // initial Capactiy = 2
        System.out.println("Initial Capacity: " + vector.capacity());

        // Add Elements to trigger capacity increase
        vector.add(10);
        vector.add(20);
        System.out.println("Capacity after adding 2 elements: " + vector.capacity());

        vector.add(30); // Triggers resize (2 → 4)
        System.out.println("Capacity after adding 3rd element: " + vector.capacity());

        vector.add(40);
        vector.add(50); // Triggers resize (4 → 8)
        System.out.println("Capacity after adding 5 elements: " + vector.capacity());

    }
}
