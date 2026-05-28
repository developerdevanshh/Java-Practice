package com.dev.engineer.solid;

class Student {
    String name;
    int marks;

    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
}

class GradeCalculator {
    String calculateGrade(Student s){
        if(s.marks >= 90){
            return "A";
        }else if(s.marks >= 75){
            return "B";
        }else if(s.marks >= 50){
            return "C";
        }else {
            return "Failed";
        }
    }
}

class ReportCardPrinter {
    void printReport(Student s, String grade){
        System.out.println("------- Report Card -------");
        System.out.println("Name: " + s.name);
        System.out.println("Marks: " + s.marks);
        System.out.println("Grade: " + grade);
    }
}

class StudentRepository{
    void save(Student s){
        System.out.println("Student saved to database.");
    }
}

public class S_ReportCard {
    public static void main(String[] args) {
        Student s = new Student("Devansh", 74);

        GradeCalculator gc = new GradeCalculator();
        String g = gc.calculateGrade(s);

        ReportCardPrinter rcp = new ReportCardPrinter();
        rcp.printReport(s,g);

        StudentRepository srepo = new StudentRepository();
        srepo.save(s);
    }
}
