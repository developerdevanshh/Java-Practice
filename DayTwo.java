import java.util.Scanner;

public class DayTwo{
    public static void main(String[] args){
        // Grade calculator
        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter Your marks:");

        // int marks = input.nextInt();
        // if(marks >= 90){
        //     System.out.println("Grade A");
        // } else if(marks >= 80){
        //     System.out.println("Grade B");
        // } else if(marks >= 70){
        //     System.out.println("Grade C");
        // } else if(marks >= 60){
        //     System.out.println("Grade D");
        // } else {
        //     System.out.println("Grade F");
        // }

        // Leap year checker
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = sc.nextInt();
        if(year % 4 == 0){
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}