package com.dev.engineer.exception_handling;
import java.io.FileReader;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        try{
            FileReader file = new FileReader("Add.txt");
            System.out.println("File Opened Successfully.");
        } catch (Exception e){
            System.out.println("Checked Exception Handled.");
            System.out.println(e);
        }
    }
}
