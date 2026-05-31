package com.dev.engineer.exception_handling;

public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        System.out.println("Program Started.");
        try{
            int a = 10;
            int b = 0;

            int res = a / b;

            System.out.println("Result: " + res);
        } catch (ArithmeticException e) {
            System.out.println("Exception Caught");
            System.out.println(e);
        } finally {
            System.out.println("Finally Block Executed.");
        }
        System.out.println("Program Ended.");
    }
}
