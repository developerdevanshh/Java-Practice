package com.dev.java.practice.multithreading;

class TotalEarnings extends Thread {
    int total = 0;
    public void run(){
        synchronized (this){
            for(int i = 1;i <= 10;i++) {
                total += 100;
            }
            this.notify();
        }
//        System.out.println(total);
    }
}

public class MovieBookApp {
    public static void main(String[] args) throws InterruptedException {
        TotalEarnings te = new TotalEarnings();
        te.start();
        synchronized (te){
            te.wait();
        }
//        System.out.println("Total Earnings : " + te.total);
    }
}
