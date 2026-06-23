package Practice.src.com.dev.java.practice.multithreading;

public class VolatileNotEnough {
    volatile int count = 0;
//    int count = 0;
    void increment(){
        count++; // volatile but still not atomic!
    }
    public static void main(String[] args) throws InterruptedException {
        VolatileNotEnough obj = new VolatileNotEnough();

        Thread t1 = new Thread(() -> {
            for (int i=0;i<10000;i++) obj.increment();
        });

        Thread t2 = new Thread(()-> {
            for(int i=0;i<10000;i++) obj.increment();
        });

        t1.start();
        t1.join();
        t2.start();
        t2.join();

        // Still less than 20000 volatile alone not enough
        System.out.println("Count: " + obj.count);
    }
}
