package com.dev.engineer.humans;

public class GrandParents {

    private boolean hasSuperPowers;

    public boolean hasSuperPower(){
        return hasSuperPowers;
    }

    private String name;
    private int age;

    public GrandParents(int age, String name){
        this.age = age;
        this.name = name;
        hasSuperPowers = false;
        System.out.println("Grandparents Constructor Called.");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
