package com.dev.java.practice.collections;
import java.util.Stack;
import java.io.*;
import java.util.*;
public class StackExample {
    public static void main(String[] args) {
//        // Create a new stack
//        Stack<Integer> s = new Stack<>();
//
//        // Push Elements onto the stack
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        s.push(4);
//
//        // Pop elements from the stack
//        while (!s.isEmpty()){
//            System.out.println(s.pop());
//        }

        // Default Initialization of Stack
//        Stack stack1 = new Stack();

        // Initialization of Stack using Generics
        Stack<String> stack = new Stack<String>();

        // pushing the elements
        stack.push("4");
        stack.push("All");
        stack.push("Geeks");
        stack.push("Devs");

//        stack2.push("I");
//        stack2.push("am");
//        stack2.push("from");
//        stack2.push("Kota.");

        // Displaying the Stack
        System.out.println("Initial Stack: " + stack);
//        System.out.println(stack2);


    }
}
