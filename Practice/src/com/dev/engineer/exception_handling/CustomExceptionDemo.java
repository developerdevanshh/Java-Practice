package com.dev.engineer.exception_handling;

public class CustomExceptionDemo {

    static void checkAge(int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("Age must be 18 or above.");
        } else {
            System.out.println("Eligible for voting.");
        }
    }

    public static void main(String[] args) {
        try{
            checkAge(17);
        } catch (InvalidAgeException e){
            System.out.println("Custom Exception Caught.");
            System.out.println(e.getMessage());
        }
    }
}
