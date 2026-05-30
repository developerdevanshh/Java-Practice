package com.dev.engineer.autoboxingandunboxing;

import java.util.ArrayList;

public class Example2 {
    public static void main(String[] args) {
        // Creating an empty ArrayList of integer type
        ArrayList<Integer> al = new ArrayList<Integer>();

        // Adding the int primitives type values using add() method Autoboxing
        al.add(1);
        al.add(2);
        al.add(24);

        // Printing the ArrayList elements
        System.out.println("ArrayList: " + al);
    }
}
