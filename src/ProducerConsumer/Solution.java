package ProducerConsumer;

public class Solution {
    public static void main(String args[]) throws InterruptedException {
        TransferObject transferObject = new TransferObject();
        ProducerTask producerTask = new ProducerTask(transferObject);
        ConsumerTask consumerTask = new ConsumerTask(transferObject);

        Thread.sleep(5000);
        producerTask.stop();
        consumerTask.stop();
    }
}
