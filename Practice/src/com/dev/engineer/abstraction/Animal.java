package com.dev.engineer.abstraction;

public abstract class Animal {
    private int age;
    private int name;
    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void SayHello(); // Abstract method

    public void Sleep(){ //Concrete Method
        System.out.println("zzz.....");
    }
}
