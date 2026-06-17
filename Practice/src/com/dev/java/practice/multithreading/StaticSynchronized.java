package com.dev.java.practice.multithreading;

class BookTheaterSeat{
    int total_seats = 20;

    synchronized void bookSeat(int seats){
        if(total_seats >= seats){
            System.out.println(seats + " Seats booked successfully.");
            total_seats = total_seats - seats;
            System.out.println("Seats left : " + total_seats);
        }else{
            System.out.println("Seats cannot be booked.");
            System.out.println("Seats left : "  + total_seats);
        }
    }
//     void bookSeat(int seats){
//        if(total_seats >= seats){
//            System.out.println(seats + " Seats booked successfully.");
//            total_seats = total_seats - seats;
//            System.out.println("Seats left : " + total_seats);
//        }else{
//            System.out.println("Seats cannot be booked.");
//            System.out.println("Seats left : "  + total_seats);
//        }
//    }
}

class MyThread1 extends Thread{
    BookTheaterSeat b;
    int seats;
    MyThread1(BookTheaterSeat b, int seats){
        this.b = b;
        this.seats = seats;
    }
    public void run(){
        b.bookSeat(seats);
    }
}

class MyThread2 extends Thread{
    BookTheaterSeat b;
    int seats;
    MyThread2(BookTheaterSeat b, int seats){
        this.b = b;
        this.seats = seats;
    }
    public void run(){
        b.bookSeat(seats);
    }
}
public class StaticSynchronized {
    public static void main(String[] args) {
        BookTheaterSeat a = new BookTheaterSeat();
        MyThread1 mt1 = new MyThread1(a,7);
        mt1.start();

        MyThread2 mt2 = new MyThread2(a, 9);
        mt2.start();

        // ================================


        BookTheaterSeat a1 = new BookTheaterSeat();
        MyThread1 t1 = new MyThread1(a1,5);
        t1.start();

        MyThread2 t2 = new MyThread2(a1, 8);
        t2.start();
    }
}
