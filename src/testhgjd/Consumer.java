package testhgjd;

import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{




    private BlockingQueue queue;

    public Consumer(BlockingQueue queue) {
        this.queue = queue;
    }


    @Override
    public void run() {
        try {
            while (true) {
                System.out.println(queue.take());
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            System.out.println(String.format("[%s] thread was terminated", Thread.currentThread().getName()));
        }

    }
}