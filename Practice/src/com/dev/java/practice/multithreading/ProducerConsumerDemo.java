package Practice.src.com.dev.java.practice.multithreading;

import java.util.LinkedList;
import java.util.Queue;

class SharedBuffer {
    Queue<Integer> queue = new LinkedList<>();
    int capacity = 5;

    // Producer - adds items
    synchronized void produce(int item) throws InterruptedException{
        while(queue.size() == capacity){
            System.out.println("Buffer full - Producer waiting");
            wait(); // release lock and waits
        }

        queue.add(item);
        System.out.println("Produced: " + item + "| Buffer: " + queue);
        notifyAll(); // wake up waiting consumers
    }

    // Consumer - removes items
    synchronized int consume() throws InterruptedException {
        while(queue.isEmpty()){
            System.out.println("Buffer empty - Consumer waiting");
            wait(); // release lock and waits
        }

        int item = queue.poll();
        System.out.println("Consumed: " + item + " | Buffer: " + queue);
        notifyAll();
        return item;
    }
}

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();

        // Producer thread
        Thread producer = new Thread(() -> {
            for(int i = 1; i <= 10; i++){
                try{
                    buffer.produce(i);
                    Thread.sleep(100);
                } catch(InterruptedException e){}
            }
        });

        // Consumer Thread
        Thread consumer = new Thread(()->{
           for(int i = 1; i <= 10; i++){
               try{
                   buffer.consume();
                   Thread.sleep(200); // consumes slower than produces
               }catch (InterruptedException e) {}
           }
        });

        producer.start();
        consumer.start();
    }
}
