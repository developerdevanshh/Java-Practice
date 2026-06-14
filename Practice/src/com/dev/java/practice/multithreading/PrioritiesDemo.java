package com.dev.java.practice.multithreading;

public class PrioritiesDemo extends Thread{

    public void run(){
        System.out.println("Child Thread priority : " + Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        System.out.println("Main Thread old priority : " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println("Main Thread new priority : " + Thread.currentThread().getPriority());

        PrioritiesDemo pd = new PrioritiesDemo();
        pd.start();

    }
}
