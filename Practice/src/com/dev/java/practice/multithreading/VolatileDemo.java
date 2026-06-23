package Practice.src.com.dev.java.practice.multithreading;

class Task {
    // Without volatile - thread may cache 'running' and forever
//    boolean running = true;
    volatile boolean running = true;

    void run(){
        int count = 0;
        while(running){
            count++;
        }
        System.out.println("Thread stopped. Count: " + count);
    }

    void stop(){
        running = false;
        System.out.println("Stop signal sent");
    }
}

public class VolatileDemo {
    public static void main(String[] args) throws InterruptedException {
        Task t = new Task();

        Thread worker = new Thread(()-> t.run());
        worker.start();

        Thread.sleep(100); // let worker run for 100ms
        t.stop(); // signal to stop
    }
}
