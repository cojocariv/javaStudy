package ProducerConsumer;

public class ConsumerTask implements Runnable {
    private TransferObject transferObject;
    protected volatile boolean stopped;

    public ConsumerTask(TransferObject transferObject) {
        this.transferObject = transferObject;
        new Thread(this, "ConsumerTask").start();
    }

    public void run() {
        synchronized (transferObject) {
            while (!stopped) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                transferObject.get();
            }
        }
    }

    public void stop() {
        stopped = true;
    }
}