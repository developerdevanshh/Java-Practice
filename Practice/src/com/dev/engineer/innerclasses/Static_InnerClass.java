//    A class declared with static inside another class.
//
//    Key Points
//    behaves like static member
//    can access only static members of outer class directly
//    object of outer class NOT required
package com.dev.engineer.innerclasses;
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
