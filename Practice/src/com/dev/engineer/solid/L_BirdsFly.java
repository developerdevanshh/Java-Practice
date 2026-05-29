package com.dev.engineer.solid;

class Bird{
    void eat(){
        System.out.println("Bird is eating.");
    }
}

interface Flyable {
    void fly();
}

class Sparrow extends Bird implements Flyable{
    public void fly() {
        System.out.println("Sparrow Flies");
    }
}

class Ostrich extends Bird {
    void run(){
        System.out.println("Ostrich runs fast");
    }
}

public class L_BirdsFly {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        sparrow.eat();
        sparrow.fly();

        Ostrich ostrich = new Ostrich();
        ostrich.eat();
        ostrich.run();
    }
}
