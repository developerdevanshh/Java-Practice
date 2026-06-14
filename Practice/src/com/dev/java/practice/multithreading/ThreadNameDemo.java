package com.dev.java.practice.multithreading;

public class ThreadNameDemo extends Thread {
    public void run(){
        System.out.println("Thread Tasks.");
    }
    public static void main(String[] args) {
        System.out.println("Hello");
        String s = Thread.currentThread().getName();
        System.out.println(s);
        Thread.currentThread().setName("Dev");
        String d = Thread.currentThread().getName();
        System.out.println(d);
        System.out.println(0/10);
        ThreadNameDemo tnd = new ThreadNameDemo();
        Thread t = new Thread(tnd);
        t.start();
    }
}
