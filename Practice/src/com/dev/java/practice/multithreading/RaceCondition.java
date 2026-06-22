package com.dev.java.practice.multithreading;

class Counter {
    int count = 0;

    void increment(){
        count++; // Not atomic - Read, Add, Write
    }
}

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread thread1 = new Thread(() -> {
            for(int i=0;i< 10000;i++){
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for(int i=0;i< 10000;i++){
                counter.increment();
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        // Expected: 20000
        // Actual: something less — race condition!
        System.out.println("Final Count: " + counter.count);
    }
}
