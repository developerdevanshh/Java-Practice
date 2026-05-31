package com.dev.engineer.exception_handling;

//import javax.annotation.processing.FilerException;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsDemo {
    static void readFile() throws FileNotFoundException {
        FileReader file = new FileReader("dev.txt");
        System.out.println("File Opened");
    }

    public static void main(String[] args) {
        try{
            readFile();
        }catch (FileNotFoundException e){
            System.out.println("Exception Handled");
            System.out.println(e);
        }
    }
}
