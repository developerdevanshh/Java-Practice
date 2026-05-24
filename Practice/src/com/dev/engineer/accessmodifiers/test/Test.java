package com.dev.engineer.accessmodifiers.test;

import com.dev.engineer.accessmodifiers.school.Student;

import java.util.Scanner;

public class Test  {
    public static void main(String[] args) {
        School.getInstance();

        School.getInstance();
        School.getInstance();
        School.getInstance();

    }
}
