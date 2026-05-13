package com.dev.engineer.test;

import com.dev.engineer.animals.Cat;
import com.dev.engineer.animals.Dog;
import com.dev.engineer.animals.Animal;
import com.dev.engineer.humans.Child;
import com.dev.engineer.humans.Parents;
import com.dev.engineer.multipleInheritance.Smartphone;

public class Test {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.setAge(23);
//        System.out.println(student.getAge());

//        BankAccount bankAccount1 = new BankAccount();
//        BankAccount bankAccount2 = new BankAccount();
//        bankAccount1.deposit(-10);
//        bankAccount1.widthraw(10);
//        bankAccount1.deposit(100);
//        bankAccount1.deposit(10);
//        System.out.println(bankAccount1.getBalance());

//        Dog dog = new Dog();
//        dog.setAge(10);
//        dog.setName("BOB");
//        System.out.println(dog.getAge());
//        System.out.println(dog.getName());
//        dog.eat();
//        dog.sayHello(); // overrides the method
//
//        Child child = new Child(12, "Nikk");
//        System.out.println(child.getAge());
//        System.out.println(child.getName());
//        child.ChildMethod();
//        child.setAge(23);
//        child.setName("Devansh");
//        System.out.println(child.getAge());
//        System.out.println(child.getName());
//
//        Parents parents = new Parents();
//        parents.setAge(45);
//        parents.setName("KB");
//        System.out.println(parents.getAge());
//        System.out.println(parents.getName());

//        Smartphone smartphone = new Smartphone();
//        smartphone.ClickPhoto();

        Animal animal = new Animal();
        animal.sayHello();

        Animal bob = new Dog();
        bob.sayHello();
//        bob.SayBye(); // Say bye does not work because animal class does not have the saybye method.

        Animal kitty = new Cat();
        kitty.sayHello();

    }
}
