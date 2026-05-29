// Non-static class directly inside outer class.

// Key Points
// can access ALL members of outer class
// requires outer class object
// tightly connected to outer object

package com.dev.engineer.innerclasses;
class Outer1 {
    int x = 100;

    class Inner1 {
        void show(){
            System.out.println("x = "+x);
        }
    }
}
public class MemberInnerClass {
    public static void main(String[] args) {
        Outer1 outer = new Outer1();
        Outer1.Inner1 inner = outer.new Inner1();
        inner.show();
    }
}
