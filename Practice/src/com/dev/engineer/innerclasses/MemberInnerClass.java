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
