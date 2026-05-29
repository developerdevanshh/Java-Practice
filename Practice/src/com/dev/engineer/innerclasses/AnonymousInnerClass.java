//    Inner class without name.
//
//    Used when:
//
//    Class needed only once
//    Usually for interface or abstract class implementation

package com.dev.engineer.innerclasses;
interface Greeting {
    void sayHello();
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Greeting g = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello Dev!");
            }
        };

        g.sayHello();

    }
}
