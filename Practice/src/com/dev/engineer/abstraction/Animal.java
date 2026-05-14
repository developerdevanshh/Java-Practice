package com.dev.engineer.abstraction;

public abstract class Animal {
    public abstract void SayHello(); // Abstract method

    public void Sleep(){ //Concrete Method
        System.out.println("zzz.....");
    }
}
