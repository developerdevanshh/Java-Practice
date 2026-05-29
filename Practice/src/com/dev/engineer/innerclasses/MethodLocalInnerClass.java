// A class declared inside a method.
// Key Points
// scope limited to method
// cannot access non-final local variables directly (before Java 8)
// used for method-specific logic

package com.dev.engineer.innerclasses;
class Outer2 {
    void display(){
        int num = 200;
        class Inner2 {
            void show(){
                System.out.println("Number = "+ num);
            }
        }
        Inner2 obj = new Inner2();
        obj.show();
    }
}

public class MethodLocalInnerClass {
    public static void main(String[] args) {
        Outer2 outer = new Outer2();
        outer.display();
    }
}
