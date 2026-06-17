package com.dev.java.practice.multithreading;

class BookTheaterApp{
    int total_seats = 20;

    void bookSeat(int seats){
        if(total_seats >= seats){
            System.out.println("Seats booked successfully.");
            total_seats = total_seats - seats;
            System.out.println("Seats left" + total_seats);
        }else{
            System.out.println("Seats cannot be booked.");
            System.out.println("Seats left" + total_seats);
        }
    }
}

class MyThread1 extends Thread{
    BookTheaterApp b;
    int seats;
    MyThread1(BookTheaterApp b, int seats){
        this.b = b;
        this.seats = seats;
    }
    public void run(){
        b.bookSeat(seats);
    }
}

class MyThread2 extends Thread{
    BookTheaterApp b;
    int seats;
    MyThread2(BookTheaterApp b, int seats){
        this.b = b;
        this.seats = seats;
    }
    public void run(){
        b.bookSeat(seats);
    }
}
public class StaticSynchronized {
    public static void main(String[] args) {

    }
}
