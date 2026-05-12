package com.dev.engineer.test;

import com.dev.engineer.animals.Dog;
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

        Dog dog = new Dog();
        dog.setAge(10);
        dog.setName("BOB");
        System.out.println(dog.getAge());
        System.out.println(dog.getName());
        dog.eat();
        dog.sayHello(); // overrides the method
    }
}
