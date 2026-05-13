package com.dev.engineer.humans;

public class Parents extends GrandParents{
    public Parents(int age, String name){
        super(age,name);
        System.out.println("Parents Constructor Called.");
    }
    public void ParentMethod(){
        System.out.println("Parents Method Called.");
    }
}
