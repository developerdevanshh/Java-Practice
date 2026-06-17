package com.dev.java.practice.multithreading;

class TotalEarnings extends Thread {
    int total = 0;
    public void run(){
        for(int i = 1;i <= 10;i++)
        {
            total += 100;
        }
        System.out.println(total);
    }
}

public class MovieBookApp {
    public static void main(String[] args) {
        TotalEarnings te = new TotalEarnings();
        te.start();
    }
}
