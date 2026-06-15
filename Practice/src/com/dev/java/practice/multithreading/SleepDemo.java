package com.dev.java.practice.multithreading;

public class SleepDemo extends Thread{
    public void run(){
//        try{
        Thread.yield();
            for(int i = 0; i< 5;i++){
                System.out.println(i + " : " + Thread.currentThread().getName());
//                Thread.sleep(1000);
            }
//        }catch (Exception e){
//            System.out.println(e);
//        }
    }

    public static void main(String[] args) {
        SleepDemo sd = new SleepDemo();
//        Thread t = new Thread(sd);
//        t.start();
        sd.start();
//        Thread.yield(); // if you want main method to stop and provide chance to other threads for execution.
        for(int i = 0; i< 5;i++){
            System.out.println(i + " : " + Thread.currentThread().getName());
//                Thread.sleep(1000);
        }

//        SleepDemo sd1 = new SleepDemo();
////        sd1.start();
//        sd1.run();
    }
}

