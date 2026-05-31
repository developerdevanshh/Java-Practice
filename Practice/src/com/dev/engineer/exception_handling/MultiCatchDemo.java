package com.dev.engineer.exception_handling;

public class MultiCatchDemo {
    public static void main(String[] args) {
        try {
            int[] arr = {10,20,30};
            int res = 10 / 0;
            System.out.println(arr[5]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Exception Handled.");
            System.out.println(e);
        }
        System.out.println("Programs Continues");
    }
}
