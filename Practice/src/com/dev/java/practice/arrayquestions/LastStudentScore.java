package com.dev.java.practice.arrayquestions;

import java.util.*;
public class LastStudentScore {
    public static void main(String[] args) {
        // { studentID, score }
        int[][] students = {
                {101, 85},
                {102, 85},
                {103, 83},
                {104, 85},
                {105, 84}
        };

        int x = 85; // Score to check
        int k = 3; // required frequency

        int frequency = 0;
        int lastStudentID = -1;

        for(int i=0;i < students.length; i++){
            if(students[i][1] == x)     {
                 frequency++;
                 lastStudentID = students[i][0]; // Keep updating last ID
            }
        }

        if(frequency >= k){
            System.out.println(lastStudentID);
        }else {
            System.out.println(-1);
        }
    }
}
