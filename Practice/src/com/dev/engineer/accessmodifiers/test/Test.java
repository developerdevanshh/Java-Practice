package com.dev.engineer.accessmodifiers.test;

import com.dev.engineer.accessmodifiers.school.Student;
import com.dev.engineer.accessmodifiers.zoo.Dog;

import java.util.Scanner;

public class Test  {
    public static void main(String[] args) {
        Dog dog = new Dog("Leo");
        dog.setDogSound("Woof");
        dog.makeSound();
        dog.wagTail();


    }
}
