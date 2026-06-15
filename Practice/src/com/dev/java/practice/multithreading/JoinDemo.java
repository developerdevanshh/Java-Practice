package com.dev.java.practice.multithreading;

public class JoinDemo extends Thread {
    static Thread mainThread;
    public void run() {
        try{
            mainThread.join();
            for(int i=1;i<=5;i++){
                System.out.println("Child Thread : " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        mainThread = Thread.currentThread();
        JoinDemo jd = new JoinDemo();
        jd.start();
//        jd.join();

        try{
            for(int i=1;i<=5;i++){
                System.out.println("Main Thread : " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
