package com.dev.java.practice.multithreading;

public class ThreadNameDemo {
    public static void main(String[] args) {
        System.out.println("Hello");
        String s = Thread.currentThread().getName();
        System.out.println(s);
        Thread.currentThread().setName("Dev");
        String d = Thread.currentThread().getName();
        System.out.println(d);
    }
}
