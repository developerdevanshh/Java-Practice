package Practice.src.com.dev.java.practice.multithreading;

public class DeadLockDemo {
    static Object lock1 = new Object();
    static Object lock2 = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(()-> {
            synchronized (lock1){
                System.out.println("T1 acquired lock1, waiting for lock2");
                try{ Thread.sleep(100);} catch (InterruptedException e) {}

                synchronized (lock2){
                    System.out.println("T1 acquired lock2");
                }
            }
        });

        Thread t2 = new Thread(()-> {
            synchronized (lock2){
                System.out.println("T2 acquired lock1, waiting for lock2");
                try{ Thread.sleep(100);} catch (InterruptedException e) {}

                synchronized (lock1){
                    System.out.println("T2 acquired lock2");
                }
            }
        });
        // Program hangs forever — DEADLOCK

//        // Both threads acquire locks in Same Order
//        Thread t1 = new Thread(()-> {
//            synchronized (lock1){
//                System.out.println("T1 acquired lock1"); // always lock1 first
//                synchronized (lock2){
//                    System.out.println("T1 acquired lock2"); // then lock2
//                }
//            }
//        });
//
//        Thread t2 = new Thread(()-> {
//            synchronized (lock1){
//                System.out.println("T2 acquired lock1"); // always lock1 first
//                synchronized (lock2){
//                    System.out.println("T2 acquired lock2"); // then lock2
//                }
//            }
//        });
//
//        // Works perfectly — no deadlock

        t1.start();
        t2.start();


    }
}
