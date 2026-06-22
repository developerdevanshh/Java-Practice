package com.dev.java.practice.multithreading;

class IntrinsicDemo {
    // Every object has ONE intrinsic lock

    // Lock on 'this' (instance)
    synchronized void instanceMethod(){
        System.out.println(Thread.currentThread().getName() + "acquired lock on: " + this);
        try { Thread.sleep(1000);} catch (InterruptedException e){}
        System.out.println(Thread.currentThread().getName() + "releasing lock");
    }

    static synchronized void staticMethod(){
        System.out.println(Thread.currentThread().getName() +"acquired lock on: "+IntrinsicDemo.class);
        try { Thread.sleep(1000);} catch (InterruptedException e) {}
        System.out.println(Thread.currentThread().getName() + "releasing lock");
    }
}

public class MonitorDemo  {
    public static void main(String[] args) {
        IntrinsicDemo obj = new IntrinsicDemo();

        Thread t1 = new Thread(()-> obj.instanceMethod(), "Thread - 1");
        Thread t2 = new Thread(()-> obj.instanceMethod(), "Thread - 2");
//        Thread t2 = new Thread(()-> obj.staticMethod(), "Thread - 2");

        t1.start();
        t2.start();
    }
}
