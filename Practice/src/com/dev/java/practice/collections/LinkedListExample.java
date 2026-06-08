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
        ll.add("Five");

        System.out.println(ll);
    }
}
