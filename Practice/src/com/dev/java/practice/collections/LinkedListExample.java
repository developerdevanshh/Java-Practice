package com.dev.java.practice.collections;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        // Creating a LinkedList
        LinkedList<String> ll = new LinkedList<String>();

        // Adding elements to the LinkedList using add() method
        ll.add("One");
        ll.add("Two");
        ll.add("Three");
        ll.add("Four");
        ll.add("Five"); // add(Object)
        System.out.println(ll);

        ll.add(1,"One Again"); // add(int index, Object)
        System.out.println(ll);

        ll.set(1, "Before Two"); // set() method, we can update an element in a LinkedList
        System.out.println(ll);

    }
}
