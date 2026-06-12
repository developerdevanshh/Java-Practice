package com.dev.java.practice.collections;

import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

//class Student {
//    int rollNo;
//    String name, address;
//
//    public Student(int rollNum, String nm, String adrs){
//        this.rollNo = rollNum;
//        this.name = nm;
//        this.address = adrs;
//    }
//
//    public String toString(){
//        return this.rollNo + " " + this.name + " " + this.address;
//    }
//}
//
//// Comparator Class
//class SortByRoll implements Comparator<Student>{
//    public int compare(Student a, Student b){
//        // Compare based on roll number
//        return a.rollNo - b.rollNo;
//    }
//}
public class TreeMapExample {


    static void TreeMapConstructor(){
        // Create a TreeMap of Strings (keys) and Integer (values)
        TreeMap<String, Integer> tm = new TreeMap<>();

        // Create a TreeMap using a Comparator
        tm.put("Ravi",12);
        tm.put("Neelam",15);
        tm.put("Neel",5);

        // Creating TreeMap using the Map
        TreeMap<String,Integer> m = new TreeMap<String,Integer>(tm);

        System.out.println("TreeMap: " + m);

    }

    public static void main(String[] args) {
        System.out.println("TreeMap using TreeMap(Map) TreeMapConstructor");
        // Create a TreeMap using a Comparator
//        TreeMap<Student, Integer> tm = new TreeMap<>(new SortByRoll());
//        // Mapping String values to int keys using put() method
//        tm.put(new Student(9, "Dev", "Kunhadi"),11);
//        tm.put(new Student(49, "Denial", "Kunhadi"),16);
//        tm.put(new Student(19, "Ved", "Kunhadi"),14);
//        System.out.println(tm);
        TreeMapConstructor();
    }
}
