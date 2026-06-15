package com.dev.java.practice.multithreading;

public class InterruptDemo extends Thread{

    public void run(){
        try {
            for(int i = 0;i<5;i++){
                System.out.println(i);
                Thread.sleep(500);
            }
        }catch (Exception e){
            System.out.println("Thread Interrupted : " + e);
        }
    }
    public static void main(String[] args) {
        InterruptDemo id = new InterruptDemo();
        id.start();
    }
}
