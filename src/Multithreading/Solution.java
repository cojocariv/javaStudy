//package Multithreading;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Solution {
//    public static volatile int numSeconds = 10;
//
//    public static void main(String[] args) throws InterruptedException {
//        RacingClock clock = new RacingClock();
//clock.isInterrupted();
//        //add your code here - добавь код тут
//    }
//
//    public static class RacingClock extends Thread {
//        public RacingClock() {
//            start();
//        }
//
//        public void run() {
//
//            for (int i = 0; i < 10; i++) {
//                try {
//                    Thread.sleep(500);
//                    if (numSeconds==5){
//                        Thread.interrupted();
//                    }
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//                System.out.println(i);
//            }
//
//            //add your code here - добавь код тут
//        }
//    }
//}
