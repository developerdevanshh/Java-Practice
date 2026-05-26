package com.dev.engineer.interfaces;

import com.dev.engineer.multipleInheritance.Smartphone;

public class Test {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        Cat cat = new Cat();
//        dog.eat();
//        System.out.println(Animal.MAX_AGE);
//        System.out.println(Dog.MAX_AGE);
//        Animal.info();
//        dog.run();
//        cat.run();

        Smartphone sp = new Smartphone();
        sp.makeCall("8764125851");
        sp.endCall();
        sp.playMusic();
        sp.stopMusic();
        sp.takePhoto();
        sp.recordVideo();

    }
}
