package com.dev.engineer.humans;

public class Child extends Parents{
    public Child(int age, String name){
        super(age, name);
        System.out.println("Child Constructor Called.");
    }
    public void ChildMethod(){
        super.ParentMethod();
        System.out.println("Child Method Called.");
    }
}
