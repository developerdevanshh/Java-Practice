package com.dev.java.practice.collections;
import java.util.Stack;
import java.io.*;
import java.util.*;
public class StackExample {
    public static void main(String[] args) {
//        //        // Create a new stack
//        //        Stack<Integer> s = new Stack<>();
//        //
//        //        // Push Elements onto the stack
//        //        s.push(1);
//        //        s.push(2);
//        //        s.push(3);
//        //        s.push(4);
//        //
//        //        // Pop elements from the stack
//        //        while (!s.isEmpty()){
//        //            System.out.println(s.pop());
//        //        }
//
//                // Default Initialization of Stack
//        //        Stack stack1 = new Stack();
//
//        // Initialization of Stack using Generics
//        Stack<String> stack = new Stack<String>();
//
//        // pushing the elements
//        stack.push("4");
//        stack.push("All");
//        stack.push("Geeks");
//        stack.push("Devs");
//
//        //        stack2.push("I");
//        //        stack2.push("am");
//        //        stack2.push("from");
//        //        stack2.push("Kota.");
//
//        // Displaying the Stack
//        System.out.println("Initial Stack: " + stack);
//        // System.out.println(stack2);
//
//        // Removing elements using pop() method
//        System.out.println("Popped Element:" + stack.pop());
//        System.out.println("Popped Element:" + stack.pop());
//        stack.pop();
//
//        System.out.println("The element at the Top of the stack is: " + stack.peek());
//
//        System.out.println("Final Stack: " + stack);


        // Stack implementation
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Using Stack (LIFO): ");
        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " "); // pops elements in LIFO order
        }
        System.out.println();

        // ArrayDeque as Stack
        Deque<Integer> deque = new ArrayDeque<>();
        deque.push(10);
        deque.push(20);
        deque.push(30);

        System.out.println("Using ArrayDeque (LIFO): ");
        while (!deque.isEmpty()){
            System.out.println(deque.pop() + " ") ; // pops elements in LIFO order
        }
        System.out.println();

    }
}
