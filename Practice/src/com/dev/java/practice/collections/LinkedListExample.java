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
//        System.out.println(ll);
//
//        ll.add(1,"One Again"); // add(int index, Object)
//        System.out.println(ll);
//
//        ll.set(1, "Before Two"); // set() method, we can update an element in a LinkedList
//        System.out.println(ll);
//
//        ll.remove("Before Two"); // remove(Object): Removes the first occurrence of the specified object from the LinkedList.
//        System.out.println(ll);
//        ll.remove(1); // remove(int index) : Removes the element at the given index and shifts subsequent elements.
//        System.out.println(ll);

        // Using the Get method and the for loop
        // Using get(i) in a loop is O(n^2) for LinkedList! Bad practice for large lists
        for(int i = 0; i <ll.size();i++){
            System.out.println(ll.get(i) + " ");
        }

        System.out.println();

        // Using the for each loop OR Using iterator is recommended practise
        for(String str : ll){
            System.out.println(str + " ");
        }

    }
}
