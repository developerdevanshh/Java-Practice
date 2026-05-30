package com.dev.engineer.autoboxingandunboxing;

//import java.util.*;
//import java.io.*;

public class Example1 {
    public static void main(String[] args) {
        // Create an integer object with custom value say it be 10
        Integer i = 10;

        // Unboxing the Object
        int i1 = i;

        // Print statements
        System.out.println("Value of i: " + i);
        System.out.println("Value of i1: " + i1);

        // Autoboxing of Character
        Character dev = 'a';

        // Auto-Unboxing of Character
        char ch = dev;

        // Print statements
        System.out.println("Value of ch: " + ch);
        System.out.println("Value of dev: " + dev);
    }
}
