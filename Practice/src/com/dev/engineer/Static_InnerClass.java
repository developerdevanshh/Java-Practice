package com.dev.engineer;
class Outer {
    static int x = 10;

    // static nested class
    static class Inner {
        void display() {
            System.out.println("x = " + x);
        }
    }
}
public class Static_InnerClass {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();

        obj.display(); 
    }
}
