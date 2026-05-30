package com.dev.engineer.autoboxingandunboxing;

import java.util.ArrayList;
import java.util.List;

public class Example4 {
    public static int sumOfOddNumber(List<Integer> list){
        int sum = 0;
        for(Integer i : list){
            // Unboxing of i Automatically
            if(i % 2 != 0)
                sum += i;

            // Unboxing of i is done automatically using intvalue implicity
//            if(i.intValue() % 2 != 0)
//                sum += i.intValue();
            if(i % 2 != 0)
                sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {

        // Creating an empty ArrayList of integer type
        List<Integer> list = new ArrayList<Integer>();

        // Adding the int primitives type values to list
        for(int i = 0;i<10;i++){
            list.add(i);
        }

        // Getting sum of all odd numbers in list
        int sumOdd = sumOfOddNumber(list);

        System.out.println("Sum of odd numbers = " + sumOdd);
    }
}
