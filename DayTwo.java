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
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a year:");
        // int year = sc.nextInt();
        // if(year % 4 == 0){
        //     System.out.println(year + " is a leap year.");
        // } else {
        //     System.out.println(year + " is not a leap year.");
        // }

        // Prime Numbers
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a positive integer: ");
        // int n = sc.nextInt();
        // boolean isPrime = true;
        
        // for(int i = 2;i<=Math.sqrt(n);i++){
        //     if(n % i == 0){
        //         isPrime = false;
        //         break;
        //     }
        // }
        // if(isPrime){
        //     System.out.println(n + " is a prime number.");
        // } else {
        //     System.out.println(n + " is not a prime number.");
        // }

        // // Multiplication table generator
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number: ");
        // int table_num = sc.nextInt();

        // for(int i=1;i<=10;i++){
        //     System.out.println(table_num + " x " + i + " = " + (table_num * i));
        // }

        // Factorial calculator
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a positive integer: ");
        // int num = sc.nextInt();
        // int fac = 1;

        // for(int i=1;i<=num;i++){
        //     fac *= i;
        // }
        // System.out.println("Factorial of: " + num + " is " + fac);

        // // Fibonacci sequence generator
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number of terms: ");
        // int terms = sc.nextInt();
        // int i = 0,a = 0,b = 1, next;
        // while(i< terms){
        //     if(i<=1){
        //         next = i;
        //     } else {
        //         next = a + b;
        //         a = b;
        //         b = next;
        //     }
        //     System.out.print(next + " ");
        //     i++;
        // }

        // // Reverse a number
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number: ");
        // int num = sc.nextInt();
        // int rev = 0;
        // while(num != 0){
        //     int digit = num % 10;
        //     rev = rev * 10 + digit;
        //     num = num /10;
        // }        
        // System.out.println(rev);

        // // Palindrome Number checker
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number: ");
        // int num = sc.nextInt();
        // int mainNum = num;
        // int rev = 0;
        // while(num!=0){
        //     int digit = num % 10;
        //     rev = rev * 10 + digit;
        //     num = num / 10;
        // }
        // if(mainNum == rev){
        //     System.out.println("Yes, it is Palindrome.");
        // }else{
        //     System.out.println("No, it is not Palindrome.");
        // }

        // Arm strong number 
        int sum = 0;
        int n, num, rem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        num = n;
        int digits = String.valueOf(n).length();
        while(n != 0){
            rem = n % 10;
            sum = sum + Math.pow(rem,digits);
            sum += Math.pow(rem, digits);
            n = n / 10;
        }

        if(sum == num){
            System.out.println("This is a Armstrong number.");
        }else{
            System.out.println("This is not a Armstrong number.");
        }
    }
}