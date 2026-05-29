package com.dev.engineer.solid;

interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

interface Sleepable {
    void sleep();
}

class Human implements Workable, Eatable, Sleepable {
    public void work() {
        System.out.println("Human Works.");
    }

    public void eat() {
        System.out.println("Human eats.");
    }

    public void sleep() {
        System.out.println("Human Sleeps.");
    }
}

class Robot implements Workable {
    public void work() {
        System.out.println("Robot Works");
    }
}
public class I_Interface_Segagration {
    public static void main(String[] args) {

        Human h = new Human();
        h.eat();
        h.work();
        h.sleep();

        System.out.println();

        Robot r = new Robot();
        r.work();
    }
}
