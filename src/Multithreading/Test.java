//package Multithreading;
//
//public class Test {
//    private int counter;
//
//    public static void main(String[] args) throws InterruptedException {
//        Test test = new Test();
//        test.doWork();
//    }
//
//    public synchronized void increment() throws InterruptedException {
//        counter++;
//        Thread.sleep(100);
//        System.out.println(counter);
//    }
//
//    public void doWork() throws InterruptedException {
//        Thread thread1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10000; i++) {
//                    try {
//                        increment();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });
//        Thread thread2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10000; i++) {
//                    try {
//                        increment();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });
//        thread1.start();
//        thread2.start();
//        thread1.join();
//        thread2.join();
////        System.out.println(counter);
//    }
//
//
//}
