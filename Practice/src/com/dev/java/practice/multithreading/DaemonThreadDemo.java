package com.dev.java.practice.multithreading;

public class DaemonThreadDemo extends Thread {
    public void run(){
        System.out.println("Hello Coders!");
    }
    public static void main(String[] args) {
        System.out.println("Main Method");

        DaemonThreadDemo dtd = new DaemonThreadDemo();
        dtd.setDaemon(true);
        dtd.start();
    }
}
