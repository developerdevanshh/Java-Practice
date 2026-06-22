package com.dev.java.practice.multithreading;

class Counter1 {
    int count = 0;

    // Method level - locks entire method
    synchronized void incrementMethod(){
        count++; // Not atomic - Read, Add, Write
    }

    // Block Level - Locks only critical condition
    void incrementBlock(){
//        System.out.println("Non-critical code"); // runs freely

        synchronized(this){
            count++; // only this is locked
        }

//        System.out.println("Non-critical code again"); // runs freely
    }
}

public class SynchronizedDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter1 counter = new Counter1();

        Thread thread1 = new Thread(() -> {
            for(int i=0;i< 10000;i++){
                counter.incrementMethod();
//                counter.incrementBlock();
            }
        });

        Thread thread2 = new Thread(() -> {
            for(int i=0;i< 10000;i++){
                counter.incrementMethod();
//                counter.incrementBlock();
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
