package com.dev.engineer.abstraction;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            protected void SayHello() {

            }
        };

        Animal dog = new Dog();
        dog.SayHello();
    }
}
