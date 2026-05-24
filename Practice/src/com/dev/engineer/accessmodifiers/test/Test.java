package com.dev.engineer.accessmodifiers.test;

import com.dev.engineer.accessmodifiers.school.Student;

public class Test  {
    public static void main(String[] args) {
        Student stud = new Student();
        stud.age = 13;
        stud.name = "Ramm";
        stud.sayHello();
    }
}
