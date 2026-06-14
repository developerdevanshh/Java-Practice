package com.dev.java.practice.multithreading;

public class ThreadNameDemo extends Thread {
    public void run(){
        System.out.println("Thread Tasks. " + Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isAlive());
//        String s = Thread.currentThread().getName();
//        System.out.println(s);
    }
    public static void main(String[] args) {
        System.out.println("Hello");
        Thread.currentThread().setName("Dev");
        String d = Thread.currentThread().getName();
        System.out.println(d);
        System.out.println(0/10);
        ThreadNameDemo tnd = new ThreadNameDemo();
        Thread t = new Thread(tnd);
        String s = Thread.currentThread().getName();
        System.out.println(s);
        t.start();

        ThreadNameDemo tnd1 = new ThreadNameDemo();
        tnd1.start();
        System.out.println(Thread.currentThread().isAlive());
    }
}
