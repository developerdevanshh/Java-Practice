package com.dev.engineer.autoboxingandunboxing;

import java.util.ArrayList;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {

        // Creating an empty ArrayList of Integer Type
        List<Integer> list = new ArrayList<Integer>();

        // Adding the int primitives type values by converting them into integer wrapper object
        for (int i = 0; i < 10 ; i++){
            System.out.println(
//                    list.add(Integer.valueOf(i))
                    list.add(i)
            );
        }
    }
}
